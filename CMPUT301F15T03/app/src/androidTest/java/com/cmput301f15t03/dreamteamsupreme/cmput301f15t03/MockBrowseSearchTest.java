package com.cmput301f15t03.dreamteamsupreme.cmput301f15t03;

/**
 * Created by quentinlautischer on 2015-10-07.
 */
public class MockBrowseSearchTest {

    public MockBrowseSearchTest() {
        super(com.cmput301f15t03.dreamteamsupreme.cmput301f15t03.MainActivity.class);
    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        root = getActivity();
        BrowseSearch browseSearch = new BrowseSearch();

        Friend friend1 = new Friend("Sally");
        Friend friend2 = new Friend("Sammy");

        Inventory<Items> mockFriendInventory1 = new Inventory<Items>();
        mockFriendInventory1.add(new Items("item1", "BigCategory"));
        mockFriendInventory1.add(new Items("item2", "SmallCategory"));

        Inventory<Items> mockFriendInventory2 = new Inventory<Items>();
        mockFriendInventory1.add(new Items("item1", "BigCategory"));
        mockFriendInventory1.add(new Items("item2", "SmallCategory"));

        friend1.setInventory = mockFriendInventory1;
        friend2.setInventory = mockFriendInventory2;

    }

    public void testBrowseAllFriendsGeneralSearch(){
        //UC1.3.1.1 BrowseAllFriendsGeneralSearch
        List<Items> expectedItems = new List();
        expectedItems.add(new Items("item1", "BigCategory"));
        expectedItems.add(new Items("item2", "SmallCategory"));
        expectedItems.add(new Items("item1", "BigCategory"));
        expectedItems.add(new Items("item2", "SmallCategory"));

        List<Items> getItems = browser.getAllFriendsPublicInventories();

        int i= 0;
        For(Items i: getItems){
            assertTrue(i.equals(expectedItems.get(i)));
            i++;
        }
    }

    public void testBrowseFriendGeneralSearch(){
        //UC1.3.1.2 BrowseFriendGeneralSearch
        List<Items> expectedItems = new List();
        expectedItems.add(new Items("item1", "BigCategory");
        expectedItems.add(new Items("item2", "SmallCategory");

        List<Items> getItems = browser.getFriendPublicInventory("Sally");

        int i= 0;
        For(Items i: getItems){
            assertTrue(i.equals(expectedItems.get(i)));
            i++;
        }
    }

    public void testBrowseAllFriendsCategorySearch(){
        //UC1.3.1.3 BrowseAllFriendsCategorySearch
        List<Items> expectedItems = new List();
        expectedItems.add(new Items("item2", "SmallCategory");
        expectedItems.add(new Items("item2", "SmallCategory");

        List<Items> getItems = browser.getAllFriendsPublicInventories("SmallCategory");

        int i= 0;
        For(Items i: getItems){
            assertTrue(i.equals(expectedItems.get(i)));
            i++;
        }
    }

    public void testBrowseFriendCategorySearch(){
        //UC1.3.1.4 BrowseFriendCategorySearch
        List<Items> expectedItems = new List();
        expectedItems.add(new Items("item2", "SmallCategory");

        List<Items> getItems = browser.getFriendPublicInventory("Sally", "SmallCategory");

        int i= 0;
        For(Items i: getItems){
            assertTrue(i.equals(expectedItems.get(i)));
            i++;
        }
    }

    public void testBrowseAllFriendsTextualQuerySearch(){
        //UC1.3.1.5 BrowseAllFriendsTextualQuerySearch
        List<Items> expectedItems = new List();
        expectedItems.add(new Items("item2", "SmallCategory");
        expectedItems.add(new Items("item2", "SmallCategory");

        List<Items> getItems = browser.getAllFriendsPublicInventories("item2");

        int i= 0;
        For(Items i: getItems){
            assertTrue(i.equals(expectedItems.get(i)));
            i++;
        }
    }

    public void testBrowseFriendTextualQuerySearch(){
        //UC1.3.1.6 BrowseFriendTextualQuerySearch
        List<Items> expectedItems = new List();
        expectedItems.add(new Items("item2", "SmallCategory");

        List<Items> getItems = browser.getFriendPublicInventory("item2");

        int i= 0;
        For(Items i: getItems){
            assertTrue(i.equals(expectedItems.get(i)));
            i++;
        }
    }

    public void testOfflineBrowsing(){
        //UC1.3.3.1 OfflineBrowsing
        List<Items> expectedItems = new List();
        expectedItems.add(new Items("item1", "BigCategory"));
        expectedItems.add(new Items("item2", "SmallCategory"));
        expectedItems.add(new Items("item1", "BigCategory"));
        expectedItems.add(new Items("item2", "SmallCategory"));

        List<Items> getItems = browser.getAllFriendsPublicInventories();

        int i= 0;
        For(Items i: getItems){
            assertTrue(i.equals(expectedItems.get(i)));
            i++;
        }

        //GO OFFLINE
        List<Items> getItems = browser.getAllFriendsPublicInventories();

        int i= 0;
        For(Items i: getItems){
            assertTrue(i.equals(expectedItems.get(i)));
            i++;
        }
    }

}
