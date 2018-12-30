package org.mytests.uiobjects.example.site.sections;

import com.epam.jdi.light.elements.composite.Form;
import com.epam.jdi.light.elements.pageobjects.annotations.simple.UI;
import com.epam.jdi.light.ui.html.common.*;
import com.epam.jdi.light.ui.html.complex.*;
import org.mytests.uiobjects.example.entities.Contacts;

public class ContactForm extends Form<Contacts> {
	TextField name, lastName, position, passportNumber, passportSeria;

	Dropdown gender;
	Combobox religion;

	Checkbox passport, acceptConditions;
	TextArea description;

	@UI("['Submit']") public Button submit;
}