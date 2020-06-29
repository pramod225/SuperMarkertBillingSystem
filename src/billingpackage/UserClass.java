package billingpackage;

class UserClass {

    private String Emp_id, EmpName, Email, password,Item_id, Name, Catagory, Description;
    private int Phone_no, Discount, Quantity;
    private double Price,Total_Price;
    private byte[] Picture;

    public UserClass(String itemid, String itemname, double price, int discount, String catagory, String description, byte[] image) {
        
        this.Item_id = itemid;
        this.Name = itemname;
        this.Price = price;
        this.Discount = discount;
        this.Catagory = catagory;
        this.Description = description;
        this.Picture = image;
    }

    public String getitemid() {
        return Item_id;
    }

    public String getitemname() {
        return Name;
    }

    public Double getprice() {
        return Price;
    }

    public int getdiscount() {
        return Discount;
    }

    public String getcatagory() {
        return Catagory;
    }

    public String getdescription() {
        return Description;
    }

    public byte[] getimage() {
        return Picture;
    }

    public UserClass(String empid, String empname, String email, String password, int phoneno) {
        this.Emp_id = empid;
        this.EmpName = empname;
        this.Email = email;
        this.password = password;
        this.Phone_no = phoneno;

    }

    public String getempid() {
        return Emp_id;
    }

    public String getempname() {
        return EmpName;
    }

    public String getemail() {
        return Email;
    }

    public String getpassword() {
        return password;
    }

    public int getphoneno() {
        return Phone_no;
    }
    
    public UserClass(String itemid, String name, double price, int discount, int quantity, double totalprice, byte[] image) {
        this.Item_id = itemid;
        this.Name = name;
        this.Price = price;
        this.Discount = discount;
        this.Quantity = quantity;
        this.Total_Price = totalprice;
        this.Picture = image;

    }
    public String getname() {
        return Name;
    }
     public int getquantity() {
        return Quantity;
    }

    public double gettotalprice() {
        return Total_Price;
    }

}



