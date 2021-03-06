package edu.black.model;

public class Cars {
    private int warehouseid;
    private String warehousename;

    private int amount;
    private Integer carid;
    private String carno;
    private String carname;
    private String carmodel;
    private String carcolor;
    private String carmobile;
    private String carfrom;
    private String carcreatedate;
    private String carindate;
    private String cardescription;
    private String carto;
    private Integer factoryid;

    public Cars() {
        this.warehouseid = -1;
    }



    public Integer getCarid() {
        return carid;
    }
    public void setCarid(Integer carid) {
        this.carid = carid;
    }
    public String getCarno() {
        return carno;
    }
    public void setCarno(String carno) {
        this.carno = carno == null ? null : carno.trim();
    }
    public String getCarname() {
        return carname;
    }
    public void setCarname(String carname) {
        this.carname = carname == null ? null : carname.trim();
    }
    public String getCarmodel() {
        return carmodel;
    }
    public void setCarmodel(String carmodel) {
        this.carmodel = carmodel == null ? null : carmodel.trim();
    }
    public String getCarcolor() {
        return carcolor;
    }
    public void setCarcolor(String carcolor) {
        this.carcolor = carcolor == null ? null : carcolor.trim();
    }
    public String getCarmobile() {
        return carmobile;
    }
    public void setCarmobile(String carmobile) {
        this.carmobile = carmobile == null ? null : carmobile.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cars.carFrom
     *
     * @return the value of cars.carFrom
     *
     * @mbg.generated Mon Apr 16 21:19:55 CST 2018
     */
    public String getCarfrom() {
        return carfrom;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cars.carFrom
     *
     * @param carfrom the value for cars.carFrom
     *
     * @mbg.generated Mon Apr 16 21:19:55 CST 2018
     */
    public void setCarfrom(String carfrom) {
        this.carfrom = carfrom == null ? null : carfrom.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cars.carCreateString
     *
     * @return the value of cars.carCreateString
     *
     * @mbg.generated Mon Apr 16 21:19:55 CST 2018
     */
    public String getCarcreatedate() {
        return carcreatedate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cars.carCreateString
     *
     * @param carcreatedate the value for cars.carCreateString
     *
     * @mbg.generated Mon Apr 16 21:19:55 CST 2018
     */
    public void setCarcreatedate(String carcreatedate) {
        this.carcreatedate = carcreatedate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cars.carInString
     *
     * @return the value of cars.carInString
     *
     * @mbg.generated Mon Apr 16 21:19:55 CST 2018
     */
    public String getCarindate() {
        return carindate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cars.carInString
     *
     * @param carindate the value for cars.carInString
     *
     * @mbg.generated Mon Apr 16 21:19:55 CST 2018
     */
    public void setCarindate(String carindate) {
        this.carindate = carindate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cars.carDescription
     *
     * @return the value of cars.carDescription
     *
     * @mbg.generated Mon Apr 16 21:19:55 CST 2018
     */
    public String getCardescription() {
        return cardescription;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cars.carDescription
     *
     * @param cardescription the value for cars.carDescription
     *
     * @mbg.generated Mon Apr 16 21:19:55 CST 2018
     */
    public void setCardescription(String cardescription) {
        this.cardescription = cardescription == null ? null : cardescription.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cars.carTo
     *
     * @return the value of cars.carTo
     *
     * @mbg.generated Mon Apr 16 21:19:55 CST 2018
     */
    public String getCarto() {
        return carto;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cars.carTo
     *
     * @param carto the value for cars.carTo
     *
     * @mbg.generated Mon Apr 16 21:19:55 CST 2018
     */
    public void setCarto(String carto) {
        this.carto = carto == null ? null : carto.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cars.factoryId
     *
     * @return the value of cars.factoryId
     *
     * @mbg.generated Mon Apr 16 21:19:55 CST 2018
     */
    public Integer getFactoryid() {
        return factoryid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cars.factoryId
     *
     * @param factoryid the value for cars.factoryId
     *
     * @mbg.generated Mon Apr 16 21:19:55 CST 2018
     */
    public void setFactoryid(Integer factoryid) {
        this.factoryid = factoryid;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getWarehouseid() {
        return warehouseid;
    }

    public void setWarehouseid(int warehouseid) {
        this.warehouseid = warehouseid;
    }

    public String getWarehousename() {
        return warehousename;
    }

    public void setWarehousename(String warehousename) {
        this.warehousename = warehousename;
    }
}