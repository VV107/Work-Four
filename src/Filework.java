import java.io.File;
import java.io.FileOutputStream;
import java.io.RandomAccessFile;
import java.io.OutputStream;
public class Filework {
    public static void main(String args[])throws Exception{
        File f = new File("d:" + File.separator);
        print(f);
        RW(f);
        Ws(f);
        R(f);
    }
        private static void print(File f){
            File F=new File("d:\\midn"+File.separator);
            File file[]=F.listFiles();
            for(int i=0;i<file.length;i++){
                System.out.println(file[i]);
            }
        }
        private static void RW(File f)throws Exception{
            File F = new File("d:\\midn\\work04.txt"+File.separator);
            RandomAccessFile rdf=new RandomAccessFile(F,"rw" );
            String name=null;
            int age=0;
            name="Jack    ";
            age=20  ;
            rdf.writeBytes(name);
            rdf.writeInt(age);
            name="rose    ";
            age=19  ;
            rdf.writeBytes(name);
            rdf.writeInt(age);
            rdf.close();
        }
        private static void Ws(File f)throws Exception{
            File F = new File("d:\\midn\\work04.txt"+File.separator);
            OutputStream O=new FileOutputStream(F);
            String str="红岩好卷，我不行了！！摆烂！！！";
            byte a[]=str.getBytes();
            O.write(a);
            O.close();
        }
        private static void R(File f)throws Exception{
            File F = new File("d:\\midn\\work04.txt"+File.separator);
            RandomAccessFile read=new RandomAccessFile(F,"r");
            String str=null;
            byte b[]=new byte[24];
            read.skipBytes(24);
            for(int i=0;i<b.length;i++){
                b[i]=read.readByte();
            }
            str=new String(b);
            System.out.println(str);
            read.close();
        }


}

