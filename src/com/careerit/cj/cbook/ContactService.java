package com.careerit.cj.cbook;

import java.util.List;

public interface ContactService {

	public Contact addContact(Contact contact);

	public List<Contact> getContacts();

	public List<Contact> search(String str);

	public boolean deleteContact(int cid);

	public Contact getContact(int cid);

	public Contact updateMobile(int cid, String mobile);
}
