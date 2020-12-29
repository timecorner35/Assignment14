package assignment14;

import java.util.ArrayList;
import java.util.List;

public class Q13TJMaxx {
    /**
     * Private lists to hold regular Item objects
     * and OnSaleItem objects that represent items that sell in TJMaxx
     */
    private List<Q13Item> regularItems;
    private List<Q13OnSaleItem> onSaleItems;

    /**
     * Public no-args constructor - Instantiates regularItems and onSaleItems lists
     * as new ArrayList
     */
    public Q13TJMaxx() {
        //TODO
        regularItems = new ArrayList<>();
        onSaleItems = new ArrayList<>();

    }

    /**
     * adds an item object to regularItems list
     *
     * @param item
     */
    public void addRegularItem(Q13Item item) {
        regularItems.add(item);


    }

    /**
     * adds OnSaleItem object to onSaleItems list
     *
     * @param item
     */
    public void addOnSaleItem(Q13OnSaleItem item) {
        onSaleItems.add(item);


    }

    /**
     * getter for regularItems
     *
     * @return
     */
    public List<Q13Item> getRegularItems() {
        //TODO change from null
        return regularItems;
    }

    /**
     * getter for onSaleItems
     *
     * @return
     */
    public List<Q13OnSaleItem> getOnSaleItems() {
        //TODO change from null
        return onSaleItems;
    }

    /**
     * return count of regularItem object
     *
     * @return
     */
    public int regularItemsCount() {
        //TODO change from -1
        return regularItems.size();
    }

    /**
     * returns count of onSaleItems in TJ Maxx
     *
     * @return
     */
    public int onSaleItemsCount() {
        //TODO change from -1
        return onSaleItems.size();
    }

    /**
     * returns the name of each item in TJ Maxx starting
     * from regular item then onSaleItems
     *
     * @return
     */
    public List<String> getAllItemNames() {
        ArrayList<String> names = new ArrayList<>();
        for (Q13Item regularItem : regularItems) {
            names.add(regularItem.getName());
        }
        for (Q13OnSaleItem onSaleItem : onSaleItems) {
            names.add(onSaleItem.getName());
        }
        return names;
    }


    /**
     * gets catalog number and returns price for the item
     * it will search for the item both regularItems and onsaleonSaleItems
     *
     * @param catalogNumber
     * @returns 0.0 if product cannot be found with that catalognumber
     */
    public double getItemPrice(int catalogNumber) {
        for (Q13Item regularItem : regularItems) {
            if (catalogNumber == regularItem.getCatalogNumber()) return regularItem.getPrice();
        }
        for (Q13OnSaleItem onSaleItem : onSaleItems) {
            if (catalogNumber == onSaleItem.getCatalogNumber()) return onSaleItem.getPrice();
        }
        return 0.0;
    }

    /**
     * accepts a name then searches
     * amoung onSaleItems. Once it finds, the method will return
     * that OnSaleItem object
     *
     * @param name
     * @return
     */
    public Q13OnSaleItem getOnSaleItem(String name) {
        for (Q13OnSaleItem onSaleItem : onSaleItems) {
            if (name.equalsIgnoreCase(onSaleItem.getName())) return onSaleItem;
        }


        return null;
    }

    /**
     * removes the item with matching catalogNumber
     * from both regularItems and onSaleItems.
     * Does nothing if not found
     *
     * @param catalogNumber
     */
    public void removeItem(int catalogNumber) {
        for (Q13Item regularItem : regularItems) {
            if (catalogNumber == regularItem.getCatalogNumber()) regularItems.remove(regularItem);
        }
        for (Q13OnSaleItem onSaleItem : onSaleItems) {
            if (catalogNumber == onSaleItem.getCatalogNumber()) onSaleItems.remove(onSaleItem);
        }

    }

    /**
     * - it accepts a catalog number and finds that item
     * among regularItems and onSaleItems
     * - if it finds the item:
     * - decrease the count of the Item by 1
     * - if count reaches 0 after decrementing then remove the product(call removeItem method)
     *
     * @param catalogNumber
     */
    public void buyItem(int catalogNumber) {
        for (Q13Item regularItem : regularItems) {
            if (catalogNumber == regularItem.getCatalogNumber()){ regularItem.setQuantity(regularItem.getQuantity() - 1);}
            if (regularItem.getQuantity()==0){ removeItem(catalogNumber);}

        }
        for (Q13OnSaleItem onSaleItem : onSaleItems) {
            if (catalogNumber == onSaleItem.getCatalogNumber()) onSaleItem.setQuantity(onSaleItem.getQuantity() - 1);
            if (onSaleItem.getQuantity()==0)removeItem(catalogNumber);
        }



    }
}


