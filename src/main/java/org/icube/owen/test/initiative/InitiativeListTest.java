package org.icube.owen.test.initiative;

import static org.junit.Assert.assertNotNull;

import java.util.ArrayList;
import java.util.List;

import org.icube.owen.ObjectFactory;
import org.icube.owen.initiative.Initiative;
import org.icube.owen.initiative.InitiativeList;
import org.junit.Ignore;
import org.junit.Test;

public class InitiativeListTest {
	InitiativeList il = (InitiativeList) ObjectFactory.getInstance("org.icube.owen.initiative.InitiativeList");
	int companyId = 2;

	@Ignore
	public void testGetInitiativeList() {
		List<Initiative> iList = new ArrayList<>();
		iList = il.getInitiativeList(companyId, "Team");
		for (Initiative i : iList) {
			assertNotNull(i.getInitiativeId());
			assertNotNull(i.getInitiativeCategory());
			assertNotNull(i.getInitiativeName());
			assertNotNull(i.getInitiativeStatus());
			assertNotNull(i.getInitiativeComment());
			assertNotNull(i.getInitiativeMetrics());
			assertNotNull(i.getInitiativeEndDate());
			assertNotNull(i.getInitiativeCreationDate());
			assertNotNull(i.getInitiativeStartDate());
			assertNotNull(i.getOwnerOfList());
			if (i.getInitiativeCategory().equalsIgnoreCase("Team")) {
				assertNotNull(i.getFilterList());
			} else {
				assertNotNull(i.getPartOfEmployeeList());
			}
		}
	}

	@Test
	public void testGetInitiativeListByStatus() {
		List<Initiative> iList = new ArrayList<>();
		iList = il.getInitiativeListByStatus(companyId, "Individual", "Active");
		for (Initiative i : iList) {
			assertNotNull(i.getInitiativeId());
			assertNotNull(i.getInitiativeCategory());
			assertNotNull(i.getInitiativeName());
			assertNotNull(i.getInitiativeStatus());
			assertNotNull(i.getInitiativeComment());
			assertNotNull(i.getInitiativeMetrics());
			assertNotNull(i.getInitiativeEndDate());
			assertNotNull(i.getInitiativeStartDate());
			assertNotNull(i.getInitiativeCreationDate());
			assertNotNull(i.getOwnerOfList());
			if (i.getInitiativeCategory().equalsIgnoreCase("Team")) {
				assertNotNull(i.getFilterList());
			} else {
				assertNotNull(i.getPartOfEmployeeList());
			}
		}
	}

	@Test
	public void testGetInitiativeListByType() {
		List<Initiative> iList1 = new ArrayList<>();
		iList1 = il.getInitiativeListByType(companyId, "Individual", 1);
		for (Initiative i : iList1) {
			assertNotNull(i.getInitiativeId());
			assertNotNull(i.getInitiativeCategory());
			assertNotNull(i.getInitiativeName());
			assertNotNull(i.getInitiativeStatus());
			assertNotNull(i.getInitiativeComment());
			assertNotNull(i.getInitiativeMetrics());
			assertNotNull(i.getInitiativeEndDate());
			assertNotNull(i.getInitiativeStartDate());
			assertNotNull(i.getInitiativeCreationDate());
			assertNotNull(i.getOwnerOfList());
			if (i.getInitiativeCategory().equalsIgnoreCase("Team")) {
				assertNotNull(i.getFilterList());
			} else {
				assertNotNull(i.getPartOfEmployeeList());
			}
		}
	}

}
