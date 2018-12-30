package org.mytests.uiobjects.example.site.pages;

import com.epam.jdi.light.elements.composite.WebPage;
import com.epam.jdi.light.elements.pageobjects.annotations.Title;
import com.epam.jdi.light.elements.pageobjects.annotations.Url;
import com.epam.jdi.light.elements.pageobjects.annotations.simple.UI;
import com.epam.jdi.light.ui.html.common.*;
import com.epam.jdi.light.ui.html.complex.*;

@Url("/contacts.html") @Title("Contact Form")
public class ContactsPage extends WebPage {
	TextField name, lastName, position, passportNumber, passportSeria;

	Dropdown gender;
	Combobox religion;
	// MultiDropdown
	MultiDropdown weather;

	Checkbox passport, acceptConditions;
	TextArea description;

	@UI("['Submit']") public Button submit;
}