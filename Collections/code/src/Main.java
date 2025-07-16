class Data{
    private Integer num;
    private String name;
    private InternalData internalData;

    Data(int num, String name, int revenue){
        this.num = num;
        this.name = name;
        this.internalData = new InternalData(revenue);
    }

    public void setNum(int _num){
        this.num = _num;
    }
    public void setName(String _name){
        this.name = _name;
    }

    public Integer getNum(){
        return num;
    }
    public String getName(){
        return name;
    }
}

class InternalData {
    public Integer revenue;
    InternalData(Integer revenue){
        this.revenue = revenue;
    }
}
public class Main {
    public static void main(String[] args) {
        // Custom Classes
        Data dataObj1 = new Data(25, "Pavan", 10000);
        Data dataObj2 = new Data(45, "Yeswanth", 100);
        dataObj1.setName("Surya");
        System.out.println(dataObj2.getName());
    }
}