package br.will.graviola.service.ranking;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.util.Vector;

import javax.microedition.rms.InvalidRecordIDException;
import javax.microedition.rms.RecordEnumeration;
import javax.microedition.rms.RecordStore;

public class RecordFacade
{
	private static final String recordStore = "graviolaRanking";
	private RecordStore store;
	
	
	public RecordFacade() throws Exception 
	{
		open();
	}
	
	
	private void open() throws Exception 
	{
		store = RecordStore.openRecordStore(recordStore, true);
	}
	
	
	private void clean() throws Exception 
	{
		RecordStore.deleteRecordStore(recordStore);
	}
	
	
	private void printEnumerate() {
		try 
		{
			System.out.println(" -- print enumerate -- ");
			
			for (RecordEnumeration en = store.enumerateRecords(null, null, true); en.hasNextElement();)
			{
				System.out.println( "id: "+en.nextRecordId()+" -> "+ read( en.nextRecord() ) );
			}
		} catch (Exception e) {e.printStackTrace();}
	}
	
	
	/**
	 * Método facilitador para ler as porcarias de byte array que
	 * vêm no diabo do RecordStore
	 * 
	 * @param bytes 
	 * @return String lida usando ByteArrayInputStream e DataInputStream
	 * @throws Exception
	 */
	private String read(byte[] bytes) throws Exception
	{
		ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
		DataInputStream dis = new DataInputStream(bais);
		String s = dis.readUTF();
		dis.close();
		bais.close();
		return s;
	}
	
	
	public Vector lerRegistroDeLinhasAcessadas() throws Exception 
	{
		Vector v = new Vector();
		for (RecordEnumeration en = store.enumerateRecords(null, null, true); en.hasNextElement();)
		{
			String record = read(en.nextRecord());
			v.addElement( record );
		}
		return v;
	}
	
	
	public void gravarRegistro(String valor) throws Exception
	{
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		DataOutputStream daos = new DataOutputStream( baos );
		daos.writeUTF(valor);
		byte[] bytes = baos.toByteArray();
		
		store.addRecord(bytes, 0, bytes.length);
	}
	
	
	public int count() throws Exception 
	{
		return store.getNumRecords();
	}
	
	
	public void excluirRegistroMaisAntigo() throws Exception
	{
		int nextId = store.getNextRecordID();
		for (int i = 0 ; i < nextId; i++) 
		{
			try 
			{
				store.getRecord( i );
				store.deleteRecord( i );
				break;
			}
			catch (InvalidRecordIDException irie)
			{
				// se não achou id, no pobrem, excluímos um que não dê exception
			}
		}
		
	}
	
	
	public void close() {
		try { 
			store.closeRecordStore();
		} catch (Exception e) {
			// nada a fazer
		}
	}



	
}
