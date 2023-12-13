import java.net.InetAddress;
 import java.net.UnknownHostException;

 public class NewProgram {
     public static void main(String[] args) throws Exception{
         InetAddress host = null;
         host = InetAddress.getLocalHost();
         System.out.println("Nama Komputer Anda: " + host);
         InetAddress address = null;

         try {
             address = InetAddress.getLocalHost();
         } catch (UnknownHostException e) {
             System.out.println("Unknown Host");
             System.exit(0);
         }

         System.out.println(host);
         byte[] ip = address.getAddress();
         for (int i = 0; i < ip.length; i++) {             if (i > 0) {
                 System.out.print(".");
             }
             System.out.print(ip[i] & 0xff );
         }
         System.out.println();
       }
 }