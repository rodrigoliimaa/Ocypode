@Test
	public void testIsCreditCardChkDigit_4()
		throws Exception {
		String sCCNo = "";

		boolean result = ShoppingcartValidator.isCreditCardChkDigit(sCCNo);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isCreditCardExpDate(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 9/12/14 12:24 AM
	 */
	@Test
	public void testIsCreditCardExpDate_1()
		throws Exception {
		String sCCExpDate = "aaaaa";

		boolean result = ShoppingcartValidator.isCreditCardExpDate(sCCExpDate);

		// add additional test code here
		assertEquals(false, result);
	}


	/**
	 * Run the int getRoleId() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 9/12/14 12:22 AM
	 */
	@Test
	public void testGetRoleId_1()
		throws Exception {
		BOUserRoles fixture = new BOUserRoles();
		fixture.setPartnerId(1);
		fixture.setRole("");
		fixture.setUserPrivileges(new ArrayList());
		fixture.setRoleId(1);

		int result = fixture.getRoleId();

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the ArrayList<BOUserPrivileges> getUserPrivileges() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 9/12/14 12:22 AM
	 */
	@Test
	public void testGetUserPrivileges_1()
		throws Exception {
		BOUserRoles fixture = new BOUserRoles();
		fixture.setPartnerId(1);
		fixture.setRole("");
		fixture.setUserPrivileges(new ArrayList());
		fixture.setRoleId(1);

		ArrayList<BOUserPrivileges> result = fixture.getUserPrivileges();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the Map<Integer, String> getCid2content() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 9/12/14 12:22 AM
	 */
	@Test
	public void testGetCid2content_1()
		throws Exception {
		CustomizerReference fixture = new CustomizerReference();
		fixture.setKey2cid(new Hashtable());
		fixture.setCid2content(new Hashtable());

		Map<Integer, String> result = fixture.getCid2content();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the Map<String, Integer> getKey2cid() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 9/12/14 12:22 AM
	 */
	@Test
	public void testGetKey2cid_1()
		throws Exception {
		CustomizerReference fixture = new CustomizerReference();
		fixture.setKey2cid(new Hashtable());
		fixture.setCid2content(new Hashtable());

		Map<String, Integer> result = fixture.getKey2cid();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the void setCid2content(Map<Integer,String>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 9/12/14 12:22 AM
	 */
	@Test
	public void testSetCid2content_1()
		throws Exception {
		CustomizerReference fixture = new CustomizerReference();
		fixture.setKey2cid(new Hashtable());
		fixture.setCid2content(new Hashtable());
		Map<Integer, String> cid2content = new Hashtable();

		fixture.setCid2content(cid2content);

		// add additional test code here
	}

	/**
	 * Run the void setKey2cid(Map<String,Integer>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 9/12/14 12:22 AM
	 */
	@Test
	public void testSetKey2cid_1()
		throws Exception {
		CustomizerReference fixture = new CustomizerReference();
		fixture.setKey2cid(new Hashtable());
		fixture.setCid2content(new Hashtable());
		Map<String, Integer> key2cid = new Hashtable();

		fixture.setKey2cid(key2cid);

		// add additional test code here
	}


	/**
	 * Run the Personalization() constructor test.
	 *
	 * @generatedBy CodePro at 9/12/14 12:24 AM
	 */
	@Test
	public void testPersonalization_1()
		throws Exception {
		Personalization result = new Personalization();
		assertNotNull(result);
		// add additional test code here
	}

	/**
	 * Run the List<PersLettering> getFontList() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 9/12/14 12:24 AM
	 */
	@Test
	public void testGetFontList_1()
		throws Exception {
		Personalization fixture = new Personalization();
		fixture.setTemplateName("");
		fixture.setLocationList(new Vector());
		fixture.setPrice("");
		fixture.setPerstypeid(1);
		fixture.setStandardColorList(new Vector());
		fixture.setOptionalColorList(new Vector());
		fixture.setReorderMin(1);
		fixture.setLoadMin(true);
		fixture.setFontList(new Vector());
		fixture.setMinQuantity(1);
		fixture.setPersLocColumnName("");
		fixture.setPerstypedesc("");

		List<PersLettering> result = fixture.getFontList();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<PersLocations> getLocationList() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 9/12/14 12:24 AM
	 */
	@Test
	public void testGetLocationList_1()
		throws Exception {
		Personalization fixture = new Personalization();
		fixture.setTemplateName("");
		fixture.setLocationList(new Vector());
		fixture.setPrice("");
		fixture.setPerstypeid(1);
		fixture.setStandardColorList(new Vector());
		fixture.setOptionalColorList(new Vector());
		fixture.setReorderMin(1);
		fixture.setLoadMin(true);
		fixture.setFontList(new Vector());
		fixture.setMinQuantity(1);
		fixture.setPersLocColumnName("");
		fixture.setPerstypedesc("");

		List<PersLocations> result = fixture.getLocationList();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the int getMinQuantity() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 9/12/14 12:24 AM
	 */
	@Test
	public void testGetMinQuantity_1()
		throws Exception {
		Personalization fixture = new Personalization();
		fixture.setTemplateName("");
		fixture.setLocationList(new Vector());
		fixture.setPrice("");
		fixture.setPerstypeid(1);
		fixture.setStandardColorList(new Vector());
		fixture.setOptionalColorList(new Vector());
		fixture.setReorderMin(1);
		fixture.setLoadMin(true);
		fixture.setFontList(new Vector());
		fixture.setMinQuantity(1);
		fixture.setPersLocColumnName("");
		fixture.setPerstypedesc("");

		int result = fixture.getMinQuantity();

		// add additional test code here
		assertEquals(1, result);
	}