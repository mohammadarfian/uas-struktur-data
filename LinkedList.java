public class LinkedList {

    public DataPenjualan head, tail;

    public LinkedList(){
        head=null;
        tail=null;
    }

    public void enqueue(){
        DataPenjualan dt= new DataPenjualan();
        dt.input();
        if(head==null)
            head=dt;
        else
            tail.next=dt;
        tail=dt;
    }

    public void dequeue(){
        if(head==null){
            System.out.println("Data Kosong!!!");
        }else{
            System.out.println("Nomor antri dengan id : " +head.id+ " atas nama " +head.nama);
            head=head.next;
        }
    }

    public void view(){
        if(head==null){
            System.out.println("Data Kosong!!!");
        }else{
            System.out.println("==========================================================");
            System.out.println("|| Id || Nama || Keperluan ||");
            for (DataPenjualan a=head; a!=null; a=a.next) a.read();
            System.out.println("==========================================================");

        }
    }
}
