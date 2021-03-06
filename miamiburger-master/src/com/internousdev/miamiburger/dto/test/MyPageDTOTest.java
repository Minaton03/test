package com.internousdev.miamiburger.dto.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.internousdev.miamiburger.dto.MyPageDTO;

public class MyPageDTOTest {

	// get UserId test
	@Test
	public void testGetUserId1() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "0";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetUserId2() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "2147483647";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetUserId3() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "-2147483647";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetUserId4() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "null";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetUserId5() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetUserId6() {
		MyPageDTO dto = new MyPageDTO();
		String expected = " ";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetUserId7() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "　";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetUserId8() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "abc123";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetUserId9() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "あいう１２３";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetUserId10() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "abc123あいう１２３";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetUserId11() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetUserId12() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	// set UserId test
	@Test
	public void testSetUserId1() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "0";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetUserId2() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "2147483647";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetUserId3() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "-2147483647";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetUserId4() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "null";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetUserId5() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetUserId6() {
		MyPageDTO dto = new MyPageDTO();
		String expected = " ";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetUserId7() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "　";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetUserId8() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "abc123";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetUserId9() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "あいう１２３";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetUserId10() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "abc123あいう１２３";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetUserId11() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetUserId12() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	// get password test

	@Test
	public void testGetPassword1() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "0";

		dto.setPassword(expected);
		String actual = dto.getPassword();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetPassword2() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "2147483647";

		dto.setPassword(expected);
		String actual = dto.getPassword();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetPassword3() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "-2147483647";

		dto.setPassword(expected);
		String actual = dto.getPassword();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetPassword4() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "null";

		dto.setPassword(expected);
		String actual = dto.getPassword();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetPassword5() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "";

		dto.setPassword(expected);
		String actual = dto.getPassword();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetPassword6() {
		MyPageDTO dto = new MyPageDTO();
		String expected = " ";

		dto.setPassword(expected);
		String actual = dto.getPassword();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetPassword7() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "　";

		dto.setPassword(expected);
		String actual = dto.getPassword();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetPassword8() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "abc123";

		dto.setPassword(expected);
		String actual = dto.getPassword();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetPassword9() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "あいう１２３";

		dto.setPassword(expected);
		String actual = dto.getPassword();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetPassword10() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "abc123あいう１２３";

		dto.setPassword(expected);
		String actual = dto.getPassword();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetPassword11() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setPassword(expected);
		String actual = dto.getPassword();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetPassword12() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setPassword(expected);
		String actual = dto.getPassword();
		assertEquals(expected, actual);
	}

	// set password test

	@Test
	public void testSetPassword1() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "0";

		dto.setPassword(expected);
		String actual = dto.getPassword();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetPassword2() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "2147483647";

		dto.setPassword(expected);
		String actual = dto.getPassword();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetPassword3() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "-2147483647";

		dto.setPassword(expected);
		String actual = dto.getPassword();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetPassword4() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "null";

		dto.setPassword(expected);
		String actual = dto.getPassword();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetPassword5() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "";

		dto.setPassword(expected);
		String actual = dto.getPassword();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetPassword6() {
		MyPageDTO dto = new MyPageDTO();
		String expected = " ";

		dto.setPassword(expected);
		String actual = dto.getPassword();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetPassword7() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "　";

		dto.setPassword(expected);
		String actual = dto.getPassword();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetPassword8() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "abc123";

		dto.setPassword(expected);
		String actual = dto.getPassword();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetPassword9() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "あいう１２３";

		dto.setPassword(expected);
		String actual = dto.getPassword();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetPassword10() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "abc123あいう１２３";

		dto.setPassword(expected);
		String actual = dto.getPassword();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetPassword11() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setPassword(expected);
		String actual = dto.getPassword();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetPassword12() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setPassword(expected);
		String actual = dto.getPassword();
		assertEquals(expected, actual);
	}

	// get familyName test

	@Test
	public void testGetFamilyName1() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "0";

		dto.setFamilyName(expected);
		String actual = dto.getFamilyName();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetFamilyName2() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "2147483647";

		dto.setFamilyName(expected);
		String actual = dto.getFamilyName();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetFamilyName3() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "-2147483647";

		dto.setFamilyName(expected);
		String actual = dto.getFamilyName();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetFamilyName4() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "null";

		dto.setFamilyName(expected);
		String actual = dto.getFamilyName();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetFamilyName5() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "";

		dto.setFamilyName(expected);
		String actual = dto.getFamilyName();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetFamilyName6() {
		MyPageDTO dto = new MyPageDTO();
		String expected = " ";

		dto.setFamilyName(expected);
		String actual = dto.getFamilyName();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetFamilyName7() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "　";

		dto.setFamilyName(expected);
		String actual = dto.getFamilyName();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetFamilyName8() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "abc123";

		dto.setFamilyName(expected);
		String actual = dto.getFamilyName();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetFamilyName9() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "あいう１２３";

		dto.setFamilyName(expected);
		String actual = dto.getFamilyName();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetFamilyName10() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "abc123あいう１２３";

		dto.setFamilyName(expected);
		String actual = dto.getFamilyName();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetFamilyName11() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setFamilyName(expected);
		String actual = dto.getFamilyName();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetFamilyName12() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setFamilyName(expected);
		String actual = dto.getFamilyName();
		assertEquals(expected, actual);
	}

	// set familyName test

	@Test
	public void testSetFamilyName1() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "0";

		dto.setFamilyName(expected);
		String actual = dto.getFamilyName();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetFamilyName2() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "2147483647";

		dto.setFamilyName(expected);
		String actual = dto.getFamilyName();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetFamilyName3() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "-2147483647";

		dto.setFamilyName(expected);
		String actual = dto.getFamilyName();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetFamilyName4() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "null";

		dto.setFamilyName(expected);
		String actual = dto.getFamilyName();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetFamilyName5() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "";

		dto.setFamilyName(expected);
		String actual = dto.getFamilyName();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetFamilyName6() {
		MyPageDTO dto = new MyPageDTO();
		String expected = " ";

		dto.setFamilyName(expected);
		String actual = dto.getFamilyName();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetFamilyName7() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "　";

		dto.setFamilyName(expected);
		String actual = dto.getFamilyName();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetFamilyName8() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "abc123";

		dto.setFamilyName(expected);
		String actual = dto.getFamilyName();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetFamilyName9() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "あいう１２３";

		dto.setFamilyName(expected);
		String actual = dto.getFamilyName();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetFamilyName10() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "abc123あいう１２３";

		dto.setFamilyName(expected);
		String actual = dto.getFamilyName();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetFamilyName11() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setFamilyName(expected);
		String actual = dto.getFamilyName();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetFamilyName12() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setFamilyName(expected);
		String actual = dto.getFamilyName();
		assertEquals(expected, actual);
	}

	// get firstName test

	@Test
	public void testGetFirstName1() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "0";

		dto.setFirstName(expected);
		String actual = dto.getFirstName();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetFirstName2() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "2147483647";

		dto.setFirstName(expected);
		String actual = dto.getFirstName();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetFirstName3() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "-2147483647";

		dto.setFirstName(expected);
		String actual = dto.getFirstName();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetFirstName4() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "null";

		dto.setFirstName(expected);
		String actual = dto.getFirstName();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetFirstName5() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "";

		dto.setFirstName(expected);
		String actual = dto.getFirstName();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetFirstName6() {
		MyPageDTO dto = new MyPageDTO();
		String expected = " ";

		dto.setFirstName(expected);
		String actual = dto.getFirstName();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetFirstName7() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "　";

		dto.setFirstName(expected);
		String actual = dto.getFirstName();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetFirstName8() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "abc123";

		dto.setFirstName(expected);
		String actual = dto.getFirstName();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetFirstName9() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "あいう１２３";

		dto.setFirstName(expected);
		String actual = dto.getFirstName();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetFirstName10() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "abc123あいう１２３";

		dto.setFirstName(expected);
		String actual = dto.getFirstName();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetFirstName11() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setFirstName(expected);
		String actual = dto.getFirstName();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetFirstName12() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setFirstName(expected);
		String actual = dto.getFirstName();
		assertEquals(expected, actual);
	}

	// set firstName test

	@Test
	public void testSetFirstName1() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "0";

		dto.setFirstName(expected);
		String actual = dto.getFirstName();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetFirstName2() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "2147483647";

		dto.setFirstName(expected);
		String actual = dto.getFirstName();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetFirstName3() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "-2147483647";

		dto.setFirstName(expected);
		String actual = dto.getFirstName();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetFirstName4() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "null";

		dto.setFirstName(expected);
		String actual = dto.getFirstName();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetFirstName5() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "";

		dto.setFirstName(expected);
		String actual = dto.getFirstName();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetFirstName6() {
		MyPageDTO dto = new MyPageDTO();
		String expected = " ";

		dto.setFirstName(expected);
		String actual = dto.getFirstName();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetFirstName7() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "　";

		dto.setFirstName(expected);
		String actual = dto.getFirstName();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetFirstName8() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "abc123";

		dto.setFirstName(expected);
		String actual = dto.getFirstName();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetFirstName9() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "あいう１２３";

		dto.setFirstName(expected);
		String actual = dto.getFirstName();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetFirstName10() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "abc123あいう１２３";

		dto.setFirstName(expected);
		String actual = dto.getFirstName();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetFirstName11() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setFirstName(expected);
		String actual = dto.getFirstName();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetFirstName12() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setFirstName(expected);
		String actual = dto.getFirstName();
		assertEquals(expected, actual);
	}

	// get familyNameKana test

	@Test
	public void testGetFamilyNameKana1() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "0";

		dto.setFamilyNameKana(expected);
		String actual = dto.getFamilyNameKana();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetFamilyNameKana2() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "2147483647";

		dto.setFamilyNameKana(expected);
		String actual = dto.getFamilyNameKana();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetFamilyNameKana3() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "-2147483647";

		dto.setFamilyNameKana(expected);
		String actual = dto.getFamilyNameKana();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetFamilyNameKana4() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "null";

		dto.setFamilyNameKana(expected);
		String actual = dto.getFamilyNameKana();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetFamilyNameKana5() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "";

		dto.setFamilyNameKana(expected);
		String actual = dto.getFamilyNameKana();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetFamilyNameKana6() {
		MyPageDTO dto = new MyPageDTO();
		String expected = " ";

		dto.setFamilyNameKana(expected);
		String actual = dto.getFamilyNameKana();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetFamilyNameKana7() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "　";

		dto.setFamilyNameKana(expected);
		String actual = dto.getFamilyNameKana();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetFamilyNameKana8() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "abc123";

		dto.setFamilyNameKana(expected);
		String actual = dto.getFamilyNameKana();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetFamilyNameKana9() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "あいう１２３";

		dto.setFamilyNameKana(expected);
		String actual = dto.getFamilyNameKana();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetFamilyNameKana10() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "abc123あいう１２３";

		dto.setFamilyNameKana(expected);
		String actual = dto.getFamilyNameKana();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetFamilyNameKana11() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setFamilyNameKana(expected);
		String actual = dto.getFamilyNameKana();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetFamilyNameKana12() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setFamilyNameKana(expected);
		String actual = dto.getFamilyNameKana();
		assertEquals(expected, actual);
	}

	// set familyNameKana test

	@Test
	public void testSetFamilyNameKana1() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "0";

		dto.setFamilyNameKana(expected);
		String actual = dto.getFamilyNameKana();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetFamilyNameKana2() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "2147483647";

		dto.setFamilyNameKana(expected);
		String actual = dto.getFamilyNameKana();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetFamilyNameKana3() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "-2147483647";

		dto.setFamilyNameKana(expected);
		String actual = dto.getFamilyNameKana();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetFamilyNameKana4() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "null";

		dto.setFamilyNameKana(expected);
		String actual = dto.getFamilyNameKana();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetFamilyNameKana5() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "";

		dto.setFamilyNameKana(expected);
		String actual = dto.getFamilyNameKana();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetFamilyNameKana6() {
		MyPageDTO dto = new MyPageDTO();
		String expected = " ";

		dto.setFamilyNameKana(expected);
		String actual = dto.getFamilyNameKana();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetFamilyNameKana7() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "　";

		dto.setFamilyNameKana(expected);
		String actual = dto.getFamilyNameKana();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetFamilyNameKana8() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "abc123";

		dto.setFamilyNameKana(expected);
		String actual = dto.getFamilyNameKana();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetFamilyNameKana9() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "あいう１２３";

		dto.setFamilyNameKana(expected);
		String actual = dto.getFamilyNameKana();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetFamilyNameKana10() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "abc123あいう１２３";

		dto.setFamilyNameKana(expected);
		String actual = dto.getFamilyNameKana();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetFamilyNameKana11() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setFamilyNameKana(expected);
		String actual = dto.getFamilyNameKana();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetFamilyNameKana12() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setFamilyNameKana(expected);
		String actual = dto.getFamilyNameKana();
		assertEquals(expected, actual);
	}

	// get FirstNameKana test

	@Test
	public void testGetFirstNameKana1() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "0";

		dto.setFirstNameKana(expected);
		String actual = dto.getFirstNameKana();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetFirstNameKana2() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "2147483647";

		dto.setFirstNameKana(expected);
		String actual = dto.getFirstNameKana();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetFirstNameKana3() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "-2147483647";

		dto.setFirstNameKana(expected);
		String actual = dto.getFirstNameKana();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetFirstNameKana4() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "null";

		dto.setFirstNameKana(expected);
		String actual = dto.getFirstNameKana();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetFirstNameKana5() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "";

		dto.setFirstNameKana(expected);
		String actual = dto.getFirstNameKana();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetFirstNameKana6() {
		MyPageDTO dto = new MyPageDTO();
		String expected = " ";

		dto.setFirstNameKana(expected);
		String actual = dto.getFirstNameKana();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetFirstNameKana7() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "　";

		dto.setFirstNameKana(expected);
		String actual = dto.getFirstNameKana();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetFirstNameKana8() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "abc123";

		dto.setFirstNameKana(expected);
		String actual = dto.getFirstNameKana();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetFirstNameKana9() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "あいう１２３";

		dto.setFirstNameKana(expected);
		String actual = dto.getFirstNameKana();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetFirstNameKana10() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "abc123あいう１２３";

		dto.setFirstNameKana(expected);
		String actual = dto.getFirstNameKana();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetFirstNameKana11() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setFirstNameKana(expected);
		String actual = dto.getFirstNameKana();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetFirstNameKana12() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setFirstNameKana(expected);
		String actual = dto.getFirstNameKana();
		assertEquals(expected, actual);
	}

	// set FirstNameKana test

	@Test
	public void testSetFirstNameKana1() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "0";

		dto.setFirstNameKana(expected);
		String actual = dto.getFirstNameKana();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetFirstNameKana2() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "2147483647";

		dto.setFirstNameKana(expected);
		String actual = dto.getFirstNameKana();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetFirstNameKana3() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "-2147483647";

		dto.setFirstNameKana(expected);
		String actual = dto.getFirstNameKana();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetFirstNameKana4() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "null";

		dto.setFirstNameKana(expected);
		String actual = dto.getFirstNameKana();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetFirstNameKana5() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "";

		dto.setFirstNameKana(expected);
		String actual = dto.getFirstNameKana();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetFirstNameKana6() {
		MyPageDTO dto = new MyPageDTO();
		String expected = " ";

		dto.setFirstNameKana(expected);
		String actual = dto.getFirstNameKana();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetFirstNameKana7() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "　";

		dto.setFirstNameKana(expected);
		String actual = dto.getFirstNameKana();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetFirstNameKana8() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "abc123";

		dto.setFirstNameKana(expected);
		String actual = dto.getFirstNameKana();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetFirstNameKana9() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "あいう１２３";

		dto.setFirstNameKana(expected);
		String actual = dto.getFirstNameKana();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetFirstNameKana10() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "abc123あいう１２３";

		dto.setFirstNameKana(expected);
		String actual = dto.getFirstNameKana();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetFirstNameKana11() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setFirstNameKana(expected);
		String actual = dto.getFirstNameKana();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetFirstNameKana12() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setFirstNameKana(expected);
		String actual = dto.getFirstNameKana();
		assertEquals(expected, actual);
	}

	// get sex test

	@Test
	public void testGetSex1() {
		MyPageDTO dto = new MyPageDTO();
		int expected = 0;

		dto.setSex(expected);
		int actual = dto.getSex();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetSex2() {
		MyPageDTO dto = new MyPageDTO();
		int expected = 2147483647;

		dto.setSex(expected);
		int actual = dto.getSex();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetSex3() {
		MyPageDTO dto = new MyPageDTO();
		int expected = -2147483647;

		dto.setSex(expected);
		int actual = dto.getSex();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetSex4() throws Exception{
		MyPageDTO dto = new MyPageDTO();
		try{
			int postalMax = Integer.parseInt("214748364");
			dto.setSex(postalMax);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}
	@Test
	public void testGetSex5() throws Exception{
		MyPageDTO dto = new MyPageDTO();
		try{
			int postalMin = Integer.parseInt("-214748364");
			dto.setSex(postalMin);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"-2147483648\"");
		}
	}

	// set sex test

	@Test
	public void testSetSex1() {
		MyPageDTO dto = new MyPageDTO();
		int expected = 0;

		dto.setSex(expected);
		int actual = dto.getSex();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetSex2() {
		MyPageDTO dto = new MyPageDTO();
		int expected = 2147483647;

		dto.setSex(expected);
		int actual = dto.getSex();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetSex3() {
		MyPageDTO dto = new MyPageDTO();
		int expected = -2147483647;

		dto.setSex(expected);
		int actual = dto.getSex();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetSex4() throws Exception{
		MyPageDTO dto = new MyPageDTO();
		try{
			int postalMax = Integer.parseInt("214748364");
			dto.setSex(postalMax);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}
	@Test
	public void testSetSex5() throws Exception{
		MyPageDTO dto = new MyPageDTO();
		try{
			int postalMin = Integer.parseInt("-214748364");
			dto.setSex(postalMin);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"-2147483648\"");
		}
	}

	// get email test

	@Test
	public void testGetEmail1() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "0";

		dto.setEmail(expected);
		String actual = dto.getEmail();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetEmail2() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "2147483647";

		dto.setEmail(expected);
		String actual = dto.getEmail();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetEmail3() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "-2147483647";

		dto.setEmail(expected);
		String actual = dto.getEmail();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetEmail4() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "null";

		dto.setEmail(expected);
		String actual = dto.getEmail();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetEmail5() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "";

		dto.setEmail(expected);
		String actual = dto.getEmail();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetEmail6() {
		MyPageDTO dto = new MyPageDTO();
		String expected = " ";

		dto.setEmail(expected);
		String actual = dto.getEmail();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetEmail7() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "　";

		dto.setEmail(expected);
		String actual = dto.getEmail();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetEmail8() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "abc123";

		dto.setEmail(expected);
		String actual = dto.getEmail();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetEmail9() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "あいう１２３";

		dto.setEmail(expected);
		String actual = dto.getEmail();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetEmail10() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "abc123あいう１２３";

		dto.setEmail(expected);
		String actual = dto.getEmail();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetEmail11() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setEmail(expected);
		String actual = dto.getEmail();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetEmail12() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setEmail(expected);
		String actual = dto.getEmail();
		assertEquals(expected, actual);
	}

	// set email test

	@Test
	public void testSetEmail1() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "0";

		dto.setEmail(expected);
		String actual = dto.getEmail();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetEmail2() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "2147483647";

		dto.setEmail(expected);
		String actual = dto.getEmail();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetEmail3() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "-2147483647";

		dto.setEmail(expected);
		String actual = dto.getEmail();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetEmail4() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "null";

		dto.setEmail(expected);
		String actual = dto.getEmail();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetEmail5() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "";

		dto.setEmail(expected);
		String actual = dto.getEmail();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetEmail6() {
		MyPageDTO dto = new MyPageDTO();
		String expected = " ";

		dto.setEmail(expected);
		String actual = dto.getEmail();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetEmail7() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "　";

		dto.setEmail(expected);
		String actual = dto.getEmail();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetEmail8() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "abc123";

		dto.setEmail(expected);
		String actual = dto.getEmail();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetEmail9() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "あいう１２３";

		dto.setEmail(expected);
		String actual = dto.getEmail();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetEmail10() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "abc123あいう１２３";

		dto.setEmail(expected);
		String actual = dto.getEmail();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetEmail11() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setEmail(expected);
		String actual = dto.getEmail();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetEmail12() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setEmail(expected);
		String actual = dto.getEmail();
		assertEquals(expected, actual);
	}

	// get status test

	@Test
	public void testGetStatus1() {
		MyPageDTO dto = new MyPageDTO();
		int expected = 0;

		dto.setStatus(expected);
		int actual = dto.getStatus();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetStatus2() {
		MyPageDTO dto = new MyPageDTO();
		int expected = 2147483647;

		dto.setStatus(expected);
		int actual = dto.getStatus();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetStatus3() {
		MyPageDTO dto = new MyPageDTO();
		int expected = -2147483647;

		dto.setStatus(expected);
		int actual = dto.getStatus();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetStatus4() throws Exception{
		MyPageDTO dto = new MyPageDTO();
		try{
			int postalMax = Integer.parseInt("214748364");
			dto.setStatus(postalMax);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}
	@Test
	public void testGetStatus5() throws Exception{
		MyPageDTO dto = new MyPageDTO();
		try{
			int postalMin = Integer.parseInt("-214748364");
			dto.setStatus(postalMin);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"-2147483648\"");
		}
	}

	// set status test

	@Test
	public void testSetStatus1() {
		MyPageDTO dto = new MyPageDTO();
		int expected = 0;

		dto.setStatus(expected);
		int actual = dto.getStatus();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetStatus2() {
		MyPageDTO dto = new MyPageDTO();
		int expected = 2147483647;

		dto.setStatus(expected);
		int actual = dto.getStatus();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetStatus3() {
		MyPageDTO dto = new MyPageDTO();
		int expected = -2147483647;

		dto.setStatus(expected);
		int actual = dto.getStatus();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetStatus4() throws Exception{
		MyPageDTO dto = new MyPageDTO();
		try{
			int postalMax = Integer.parseInt("214748364");
			dto.setStatus(postalMax);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}
	@Test
	public void testSetStatus5() throws Exception{
		MyPageDTO dto = new MyPageDTO();
		try{
			int postalMin = Integer.parseInt("-214748364");
			dto.setStatus(postalMin);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"-2147483648\"");
		}
	}

	// get logined test

	@Test
	public void testGetLogined1() {
		MyPageDTO dto = new MyPageDTO();
		int expected = 0;

		dto.setLogined(expected);
		int actual = dto.getLogined();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetLogined2() {
		MyPageDTO dto = new MyPageDTO();
		int expected = 2147483647;

		dto.setLogined(expected);
		int actual = dto.getLogined();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetLogined3() {
		MyPageDTO dto = new MyPageDTO();
		int expected = -2147483647;

		dto.setLogined(expected);
		int actual = dto.getLogined();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetLogined4() throws Exception{
		MyPageDTO dto = new MyPageDTO();
		try{
			int postalMax = Integer.parseInt("214748364");
			dto.setLogined(postalMax);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}
	@Test
	public void testGetLogined5() throws Exception{
		MyPageDTO dto = new MyPageDTO();
		try{
			int postalMin = Integer.parseInt("-214748364");
			dto.setLogined(postalMin);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"-2147483648\"");
		}
	}

	// set logined test

	@Test
	public void testSetLogined1() {
		MyPageDTO dto = new MyPageDTO();
		int expected = 0;

		dto.setLogined(expected);
		int actual = dto.getLogined();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetLogined2() {
		MyPageDTO dto = new MyPageDTO();
		int expected = 2147483647;

		dto.setLogined(expected);
		int actual = dto.getLogined();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetLogined3() {
		MyPageDTO dto = new MyPageDTO();
		int expected = -2147483647;

		dto.setLogined(expected);
		int actual = dto.getLogined();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetLogined4() throws Exception{
		MyPageDTO dto = new MyPageDTO();
		try{
			int postalMax = Integer.parseInt("214748364");
			dto.setLogined(postalMax);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}
	@Test
	public void testSetLogined5() throws Exception{
		MyPageDTO dto = new MyPageDTO();
		try{
			int postalMin = Integer.parseInt("-214748364");
			dto.setLogined(postalMin);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"-2147483648\"");
		}
	}

	// get registDate test

	@Test
	public void testGetRegistDate1() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "0";

		dto.setRegistDate(expected);
		String actual = dto.getRegistDate();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetRegistDate2() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "2147483647";

		dto.setRegistDate(expected);
		String actual = dto.getRegistDate();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetRegistDate3() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "-2147483647";

		dto.setRegistDate(expected);
		String actual = dto.getRegistDate();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetRegistDate4() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "null";

		dto.setRegistDate(expected);
		String actual = dto.getRegistDate();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetRegistDate5() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "";

		dto.setRegistDate(expected);
		String actual = dto.getRegistDate();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetRegistDate6() {
		MyPageDTO dto = new MyPageDTO();
		String expected = " ";

		dto.setRegistDate(expected);
		String actual = dto.getRegistDate();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetRegistDate7() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "　";

		dto.setRegistDate(expected);
		String actual = dto.getRegistDate();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetRegistDate8() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "abc123";

		dto.setRegistDate(expected);
		String actual = dto.getRegistDate();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetRegistDate9() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "あいう１２３";

		dto.setRegistDate(expected);
		String actual = dto.getRegistDate();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetRegistDate10() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "abc123あいう１２３";

		dto.setRegistDate(expected);
		String actual = dto.getRegistDate();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetRegistDate11() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setRegistDate(expected);
		String actual = dto.getRegistDate();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetRegistDate12() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setRegistDate(expected);
		String actual = dto.getRegistDate();
		assertEquals(expected, actual);
	}

	// set registDate test

	@Test
	public void testSetRegistDate1() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "0";

		dto.setRegistDate(expected);
		String actual = dto.getRegistDate();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetRegistDate2() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "2147483647";

		dto.setRegistDate(expected);
		String actual = dto.getRegistDate();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetRegistDate3() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "-2147483647";

		dto.setRegistDate(expected);
		String actual = dto.getRegistDate();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetRegistDate4() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "null";

		dto.setRegistDate(expected);
		String actual = dto.getRegistDate();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetRegistDate5() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "";

		dto.setRegistDate(expected);
		String actual = dto.getRegistDate();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetRegistDate6() {
		MyPageDTO dto = new MyPageDTO();
		String expected = " ";

		dto.setRegistDate(expected);
		String actual = dto.getRegistDate();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetRegistDate7() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "　";

		dto.setRegistDate(expected);
		String actual = dto.getRegistDate();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetRegistDate8() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "abc123";

		dto.setRegistDate(expected);
		String actual = dto.getRegistDate();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetRegistDate9() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "あいう１２３";

		dto.setRegistDate(expected);
		String actual = dto.getRegistDate();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetRegistDate10() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "abc123あいう１２３";

		dto.setRegistDate(expected);
		String actual = dto.getRegistDate();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetRegistDate11() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setRegistDate(expected);
		String actual = dto.getRegistDate();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetRegistDate12() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setRegistDate(expected);
		String actual = dto.getRegistDate();
		assertEquals(expected, actual);
	}

	// get updateDate test

	@Test
	public void testGetUpdateDate1() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "0";

		dto.setUpdateDate(expected);
		String actual = dto.getUpdateDate();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetUpdateDate2() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "2147483647";

		dto.setUpdateDate(expected);
		String actual = dto.getUpdateDate();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetUpdateDate3() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "-2147483647";

		dto.setUpdateDate(expected);
		String actual = dto.getUpdateDate();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetUpdateDate4() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "null";

		dto.setUpdateDate(expected);
		String actual = dto.getUpdateDate();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetUpdateDate5() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "";

		dto.setUpdateDate(expected);
		String actual = dto.getUpdateDate();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetUpdateDate6() {
		MyPageDTO dto = new MyPageDTO();
		String expected = " ";

		dto.setUpdateDate(expected);
		String actual = dto.getUpdateDate();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetUpdateDate7() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "　";

		dto.setUpdateDate(expected);
		String actual = dto.getUpdateDate();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetUpdateDate8() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "abc123";

		dto.setUpdateDate(expected);
		String actual = dto.getUpdateDate();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetUpdateDate9() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "あいう１２３";

		dto.setUpdateDate(expected);
		String actual = dto.getUpdateDate();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetUpdateDate10() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "abc123あいう１２３";

		dto.setUpdateDate(expected);
		String actual = dto.getUpdateDate();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetUpdateDate11() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setUpdateDate(expected);
		String actual = dto.getUpdateDate();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetUpdateDate12() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setUpdateDate(expected);
		String actual = dto.getUpdateDate();
		assertEquals(expected, actual);
	}

	// set updateDate test

	@Test
	public void testSetUpdateDate1() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "0";

		dto.setUpdateDate(expected);
		String actual = dto.getUpdateDate();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetUpdateDate2() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "2147483647";

		dto.setUpdateDate(expected);
		String actual = dto.getUpdateDate();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetUpdateDate3() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "-2147483647";

		dto.setUpdateDate(expected);
		String actual = dto.getUpdateDate();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetUpdateDate4() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "null";

		dto.setUpdateDate(expected);
		String actual = dto.getUpdateDate();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetUpdateDate5() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "";

		dto.setUpdateDate(expected);
		String actual = dto.getUpdateDate();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetUpdateDate6() {
		MyPageDTO dto = new MyPageDTO();
		String expected = " ";

		dto.setUpdateDate(expected);
		String actual = dto.getUpdateDate();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetUpdateDate7() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "　";

		dto.setUpdateDate(expected);
		String actual = dto.getUpdateDate();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetUpdateDate8() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "abc123";

		dto.setUpdateDate(expected);
		String actual = dto.getUpdateDate();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetUpdateDate9() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "あいう１２３";

		dto.setUpdateDate(expected);
		String actual = dto.getUpdateDate();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetUpdateDate10() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "abc123あいう１２３";

		dto.setUpdateDate(expected);
		String actual = dto.getUpdateDate();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetUpdateDate11() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setUpdateDate(expected);
		String actual = dto.getUpdateDate();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetUpdateDate12() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setUpdateDate(expected);
		String actual = dto.getUpdateDate();
		assertEquals(expected, actual);
	}

	// get secretQuestion test

	@Test
	public void testGetSecretQuestion1() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "0";

		dto.setSecretQuestion(expected);
		String actual = dto.getSecretQuestion();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetSecretQuestion2() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "2147483647";

		dto.setSecretQuestion(expected);
		String actual = dto.getSecretQuestion();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetSecretQuestion3() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "-2147483647";

		dto.setSecretQuestion(expected);
		String actual = dto.getSecretQuestion();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetSecretQuestion4() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "null";

		dto.setSecretQuestion(expected);
		String actual = dto.getSecretQuestion();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetSecretQuestion5() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "";

		dto.setSecretQuestion(expected);
		String actual = dto.getSecretQuestion();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetSecretQuestion6() {
		MyPageDTO dto = new MyPageDTO();
		String expected = " ";

		dto.setSecretQuestion(expected);
		String actual = dto.getSecretQuestion();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetSecretQuestion7() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "　";

		dto.setSecretQuestion(expected);
		String actual = dto.getSecretQuestion();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetSecretQuestion8() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "abc123";

		dto.setSecretQuestion(expected);
		String actual = dto.getSecretQuestion();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetSecretQuestion9() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "あいう１２３";

		dto.setSecretQuestion(expected);
		String actual = dto.getSecretQuestion();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetSecretQuestion10() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "abc123あいう１２３";

		dto.setSecretQuestion(expected);
		String actual = dto.getSecretQuestion();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetSecretQuestion11() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setSecretQuestion(expected);
		String actual = dto.getSecretQuestion();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetSecretQuestion12() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setSecretQuestion(expected);
		String actual = dto.getSecretQuestion();
		assertEquals(expected, actual);
	}

	// set secretQuestion test

	@Test
	public void testSetSecretQuestion1() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "0";

		dto.setSecretQuestion(expected);
		String actual = dto.getSecretQuestion();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetSecretQuestion2() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "2147483647";

		dto.setSecretQuestion(expected);
		String actual = dto.getSecretQuestion();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetSecretQuestion3() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "-2147483647";

		dto.setSecretQuestion(expected);
		String actual = dto.getSecretQuestion();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetSecretQuestion4() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "null";

		dto.setSecretQuestion(expected);
		String actual = dto.getSecretQuestion();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetSecretQuestion5() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "";

		dto.setSecretQuestion(expected);
		String actual = dto.getSecretQuestion();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetSecretQuestion6() {
		MyPageDTO dto = new MyPageDTO();
		String expected = " ";

		dto.setSecretQuestion(expected);
		String actual = dto.getSecretQuestion();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetSecretQuestion7() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "　";

		dto.setSecretQuestion(expected);
		String actual = dto.getSecretQuestion();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetSecretQuestion8() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "abc123";

		dto.setSecretQuestion(expected);
		String actual = dto.getSecretQuestion();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetSecretQuestion9() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "あいう１２３";

		dto.setSecretQuestion(expected);
		String actual = dto.getSecretQuestion();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetSecretQuestion10() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "abc123あいう１２３";

		dto.setSecretQuestion(expected);
		String actual = dto.getSecretQuestion();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetSecretQuestion11() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setSecretQuestion(expected);
		String actual = dto.getSecretQuestion();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetSecretQuestion12() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setSecretQuestion(expected);
		String actual = dto.getSecretQuestion();
		assertEquals(expected, actual);
	}

	// get secretAnswer test

	@Test
	public void testGetSecretAnswer1() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "0";

		dto.setSecretAnswer(expected);
		String actual = dto.getSecretAnswer();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetSecretAnswer2() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "2147483647";

		dto.setSecretAnswer(expected);
		String actual = dto.getSecretAnswer();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetSecretAnswer3() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "-2147483647";

		dto.setSecretAnswer(expected);
		String actual = dto.getSecretAnswer();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetSecretAnswer4() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "null";

		dto.setSecretAnswer(expected);
		String actual = dto.getSecretAnswer();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetSecretAnswer5() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "";

		dto.setSecretAnswer(expected);
		String actual = dto.getSecretAnswer();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetSecretAnswer6() {
		MyPageDTO dto = new MyPageDTO();
		String expected = " ";

		dto.setSecretAnswer(expected);
		String actual = dto.getSecretAnswer();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetSecretAnswer7() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "　";

		dto.setSecretAnswer(expected);
		String actual = dto.getSecretAnswer();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetSecretAnswer8() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "abc123";

		dto.setSecretAnswer(expected);
		String actual = dto.getSecretAnswer();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetSecretAnswer9() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "あいう１２３";

		dto.setSecretAnswer(expected);
		String actual = dto.getSecretAnswer();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetSecretAnswer10() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "abc123あいう１２３";

		dto.setSecretAnswer(expected);
		String actual = dto.getSecretAnswer();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetSecretAnswer11() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setSecretAnswer(expected);
		String actual = dto.getSecretAnswer();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetSecretAnswer12() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setSecretAnswer(expected);
		String actual = dto.getSecretAnswer();
		assertEquals(expected, actual);
	}

	// get secretAnswer test

	@Test
	public void testSetSecretAnswer1() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "0";

		dto.setSecretAnswer(expected);
		String actual = dto.getSecretAnswer();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetSecretAnswer2() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "2147483647";

		dto.setSecretAnswer(expected);
		String actual = dto.getSecretAnswer();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetSecretAnswer3() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "-2147483647";

		dto.setSecretAnswer(expected);
		String actual = dto.getSecretAnswer();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetSecretAnswer4() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "null";

		dto.setSecretAnswer(expected);
		String actual = dto.getSecretAnswer();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetSecretAnswer5() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "";

		dto.setSecretAnswer(expected);
		String actual = dto.getSecretAnswer();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetSecretAnswer6() {
		MyPageDTO dto = new MyPageDTO();
		String expected = " ";

		dto.setSecretAnswer(expected);
		String actual = dto.getSecretAnswer();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetSecretAnswer7() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "　";

		dto.setSecretAnswer(expected);
		String actual = dto.getSecretAnswer();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetSecretAnswer8() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "abc123";

		dto.setSecretAnswer(expected);
		String actual = dto.getSecretAnswer();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetSecretAnswer9() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "あいう１２３";

		dto.setSecretAnswer(expected);
		String actual = dto.getSecretAnswer();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetSecretAnswer10() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "abc123あいう１２３";

		dto.setSecretAnswer(expected);
		String actual = dto.getSecretAnswer();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetSecretAnswer11() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setSecretAnswer(expected);
		String actual = dto.getSecretAnswer();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetSecretAnswer12() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setSecretAnswer(expected);
		String actual = dto.getSecretAnswer();
		assertEquals(expected, actual);
	}

}
