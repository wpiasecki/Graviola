package br.will.graviola.service;

import java.util.Calendar;
import java.util.TimeZone;
import java.util.Vector;

import br.will.graviola.model.*;
import br.will.graviola.ui.HoraDrawer;

public class HoraService
{
	private Calendar cal;
	private int horaAtual;
	private int minutoAtual;
	
	public HoraService() 
	{
		cal = Calendar.getInstance( TimeZone.getDefault() );
		horaAtual = cal.get(Calendar.HOUR_OF_DAY);
		minutoAtual = cal.get(Calendar.MINUTE);
	}
	
	
	/**
	 * Valida se o horário passado como parâmetro é maior do que
	 * a hora atual
	 * 
	 * @param horaText String com a hora (HH:mm)
	 * @return TRUE, se a hora for maior.
	 */
	public boolean isProximoHorario(String horaText)
	{
		int horaBusao = Integer.parseInt(horaText.substring(0, 2));
		int minutoBusao = Integer.parseInt(horaText.substring(3));
		
		/*
		 * e se agora for 22h e tem um busão 23h, um 2h30, e um 6h30, como fica? 
		 * e se agora for 22h e tem um busão 0h30, e um 2h30, como fica? 
		 * e se agora for 00h e tem um busão 6h? 
		 * e se agora for 6h e tem um busão 00h? 
		 * e se agora for 17h e tem um busão 00h?
		 */
		if (horaBusao >= horaAtual && minutoBusao >= minutoAtual || 
				horaBusao > horaAtual)
		{
			return true;
		}
		
		
		/*
		 * esta condição tem falhas sérias: se agora for meia noite e tiver um
		 * onibus às 4, 5 ou às 6, ele não detecta. O objetivo aqui é detectar o
		 * madrugueiro. Acho que a melhor solução seria ordenar todos os horários da
		 * lista. Não tem como diferenciar se um horário tá no começo da lista ou no
		 * final dela. É necessário informação de dia.
		 */
		if (horaBusao < horaAtual && horaBusao >= 0 && horaBusao < 4)
		{
			return true;
		}

		return false;
	}

	
	public Vector findProximosHorarios(Ponto ponto)
	{
		Vector horariosMarcados = new Vector();
			
		int qtdeHorariosMarcados = 0;
			
		for (int k = 0; k < ponto.getHorarios().size(); k++)
		{
			if (qtdeHorariosMarcados >= HoraDrawer.MAXIMO_HORAS_MARCAVEIS) break; 
			
			String horario = (String) ponto.getHorarios().elementAt(k);
			
			if ( qtdeHorariosMarcados > 0 || isProximoHorario(horario) ) 
			{
				qtdeHorariosMarcados++;
				horariosMarcados.addElement(horario);
			}
		}
		
		return horariosMarcados;
	}
	
}
