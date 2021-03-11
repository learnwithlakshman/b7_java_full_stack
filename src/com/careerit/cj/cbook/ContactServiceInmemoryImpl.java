package com.careerit.cj.cbook;

import java.util.ArrayList;
import java.util.List;

public class ContactServiceInmemoryImpl implements ContactService {

	private List<Contact> list = new ArrayList<Contact>();

	@Override
	public Contact addContact(Contact contact) {
		list.add(contact);
		return contact;
	}

	@Override
	public List<Contact> getContacts() {
		return list;
	}

	@Override
	public List<Contact> search(String str) {
		List<Contact> searchList = new ArrayList<Contact>();
		for (Contact contact : list) {
			if (contact.getName().toLowerCase().contains(str.toLowerCase()) || contact.getMobile().contains(str)) {
				searchList.add(contact);
			}
		}
		return searchList;
	}

	@Override
	public boolean deleteContact(int cid) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Contact getContact(int cid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Contact updateMobile(int cid, String mobile) {
		// TODO Auto-generated method stub
		return null;
	}

}
