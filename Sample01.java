/**
 * Sample01
 * 継承
 */
public class Sample01 {
    /**
     * Customer
     */
    public claas Customer {
        String customerName; //顧客氏名
        public void setName(String name){
            customerName = name; //顧客氏名をセットする
        }
        public String getName(){
            return customerName; //顧客氏名を返す
        }
    }
    /**
     * CustomerInfo
     */
    public class CustomerInfo extends Customer {
        int customerID; //顧客ID
        public void setID(int number){
            customerID = number; //顧客IDをセットする
        }
        public int getID(){
            return customerID;
        }
    }
    /**
     * Example
     */
    public class Example {
        public static void main(String[] args) {
            CustomerInfo hayashi = new CustomerInfo();
            hayashi.setName("suzuki");
            hayashi.setID(1234);

            System.out.println(hayashi.getName());
            System.out.println(hayashi.getID());
        }
    }
}