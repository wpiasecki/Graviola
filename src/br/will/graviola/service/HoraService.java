package br.will.graviola.service;

import java.util.Calendar;
import java.util.TimeZone;
import java.util.Vector;

import br.will.graviola.model.*;
import br.will.graviola.ui.HoraDrawer;

public class HoraService
{
	
	/**
	 * Valida se o horário passado como parâmetro é maior do que
	 * a hora atual
	 * 
	 * @param horaText String com a hora (HH:mm)
	 * @return TRUE, se a hora for maior.
	 */
	public static boolean isProximoHorario(String horaText)
	{
		Calendar cal = Calendar.getInstance( TimeZone.getDefault() );
		
		int horaAtual = cal.get(Calendar.HOUR_OF_DAY);
		int minutoAtual = cal.get(Calendar.MINUTE);
		
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

	
	public static Vector getHorariosMarcados(Ponto ponto)
	{
		Vector horariosMarcados = new Vector();
			
		int qtdeHorariosMarcados = 0;
			
		for (int k = 0; k < ponto.getHorarios().size(); k++)
		{
			if (qtdeHorariosMarcados >= HoraDrawer.MAXIMO_HORAS_MARCAVEIS) break; 
			
			String horario = (String) ponto.getHorarios().elementAt(k);
			
			if ( isProximoHorario(horario) ) 
			{
				qtdeHorariosMarcados++;
				horariosMarcados.addElement(horario);
			}
		}
		
		return horariosMarcados;
	}
	
}
