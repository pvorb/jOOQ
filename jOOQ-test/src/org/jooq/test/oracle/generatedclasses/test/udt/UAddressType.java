/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle.generatedclasses.test.udt;

/**
 * This class is generated by jOOQ.
 */
public class UAddressType extends org.jooq.impl.UDTImpl<org.jooq.test.oracle.generatedclasses.test.udt.records.UAddressTypeRecord> {

	private static final long serialVersionUID = 781413964;

	/**
	 * The singleton instance of TEST.U_ADDRESS_TYPE
	 */
	public static final org.jooq.test.oracle.generatedclasses.test.udt.UAddressType U_ADDRESS_TYPE = new org.jooq.test.oracle.generatedclasses.test.udt.UAddressType();

	/**
	 * The class holding records for this type
	 */
	private static final java.lang.Class<org.jooq.test.oracle.generatedclasses.test.udt.records.UAddressTypeRecord> __RECORD_TYPE = org.jooq.test.oracle.generatedclasses.test.udt.records.UAddressTypeRecord.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.oracle.generatedclasses.test.udt.records.UAddressTypeRecord> getRecordType() {
		return __RECORD_TYPE;
	}

	/**
	 * An uncommented item
	 */
	public static final org.jooq.UDTField<org.jooq.test.oracle.generatedclasses.test.udt.records.UAddressTypeRecord, org.jooq.test.oracle.generatedclasses.test.udt.records.UStreetTypeRecord> STREET = createField("STREET", org.jooq.test.oracle.generatedclasses.test.udt.UStreetType.U_STREET_TYPE.getDataType(), U_ADDRESS_TYPE);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.UDTField<org.jooq.test.oracle.generatedclasses.test.udt.records.UAddressTypeRecord, java.lang.String> ZIP = createField("ZIP", org.jooq.impl.SQLDataType.VARCHAR, U_ADDRESS_TYPE);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.UDTField<org.jooq.test.oracle.generatedclasses.test.udt.records.UAddressTypeRecord, java.lang.String> CITY = createField("CITY", org.jooq.impl.SQLDataType.VARCHAR, U_ADDRESS_TYPE);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.UDTField<org.jooq.test.oracle.generatedclasses.test.udt.records.UAddressTypeRecord, java.lang.String> COUNTRY = createField("COUNTRY", org.jooq.impl.SQLDataType.VARCHAR, U_ADDRESS_TYPE);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.UDTField<org.jooq.test.oracle.generatedclasses.test.udt.records.UAddressTypeRecord, java.sql.Date> SINCE = createField("SINCE", org.jooq.impl.SQLDataType.DATE, U_ADDRESS_TYPE);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.UDTField<org.jooq.test.oracle.generatedclasses.test.udt.records.UAddressTypeRecord, java.lang.Integer> CODE = createField("CODE", org.jooq.impl.SQLDataType.INTEGER, U_ADDRESS_TYPE);

	/**
	 * No further instances allowed
	 */
	private UAddressType() {
		super("U_ADDRESS_TYPE", org.jooq.test.oracle.generatedclasses.test.Test.TEST);
	}
}
