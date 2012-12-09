package br.will.graviola.service;

public class OnibusService
{
	private OnibusService(){}
	
	private static HorarioOnibusService service;
	
	public static HorarioOnibusService instance()
	{
		try 
		{
			if (service == null) {
				service = new HorarioOnibusLineFileService();
			}
			
			return service;
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
			throw new RuntimeException(e.getMessage());
		}
	}
	
}
