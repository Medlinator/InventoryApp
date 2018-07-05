package com.example.android.inventoryapp.data;

import android.provider.BaseColumns;

/**
 * API Contract for the Books app.
 */
public class BookContract {

    /**
     * To prevent someone from accidentally instantiating the contract class,
     * give it an empty constructor.
     */
    private BookContract() {}

    /**
     * Inner class that defines constant values for the books database table.
     * Each entry in the table represents a single book.
     */
    public static final class BookEntry implements BaseColumns {

        /** Name of database table for books */
        public static final String TABLE_NAME = "books";

        /**
         * Unique ID number for the book (only for use in the database table).
         *
         * Type: INTEGER
         */
        public static final String _ID = BaseColumns._ID;

        /**
         * Name of the book.
         *
         * Type: TEXT
         */
        public static final String COLUMN_BOOK_NAME = "product_name";

        /**
         * Price of the book.
         *
         * Type: REAL
         */
        public static final String COLUMN_BOOK_PRICE = "price";

        /**
         * Quantity of the book in stock.
         *
         * Type: INTEGER
         */
        public static final String COLUMN_BOOK_QUANTITY = "quantity";

        /**
         * Supplier's name.
         *
         * Type: TEXT
         */
        public static final String COLUMN_BOOK_SUPPLIER_NAME = "supplier_name";

        /**
         * Supplier's phone number.
         *
         * Type: INTEGER
         */
        public static final String COLUMN_BOOK_SUPPLIER_NUMBER = "supplier_phone_number";
    }
}
