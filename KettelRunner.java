class KettelRunner{
	public static void main(String[] values){
		String[] names = new String[10];
		Kettle kettel = new Kettle(names);
		kettel.savekettaleNames("Philips");
		kettel.savekettaleNames("Morphy Richards");
		kettel.savekettaleNames("Prestige");
		kettel.savekettaleNames("Havells");
		kettel.savekettaleNames("Bajaj");
		kettel.savekettaleNames("Kent");
		kettel.savekettaleNames("Pigeon");
		kettel.savekettaleNames("Inalsa");
		kettel.savekettaleNames("Cello");
		kettel.savekettaleNames("Butterfy");
		
		kettel.searchKettleNames("Pigeon");
		kettel.searchKettleNames("Nike");
	}
}