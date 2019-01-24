package hibernate;

public class HBAddressStoreImpl implements SlimAddressStore{
	HBAddressStoreHelper hbhelper=new HBAddressStoreHelper();
	
	public int create(AddressSlim slimaddress) {
		hbhelper.saveAddress(slimaddress);
		return slimaddress.getId();
	}

	public AddressSlim read(int id) {
		AddressSlim addressslim=hbhelper.readAddress(id);
		return addressslim;
	}

	public void update(AddressSlim slimaddress) {
		hbhelper.updateAddress(slimaddress);
	}

	public int delete(int id) {
		hbhelper.deleteAddress(id);
		return id;
	}
	
	public AddressSlim convertSlimtoPojo(AddressSlim slimaddress) {
		hbhelper.convertSlimToPojo(slimaddress);
		return slimaddress;
	}
}
