public class prosedure {//class prosedure
  static void kalimat1(){//prosedure 1 dengan modifier static
  System.out.println("RPL compile success");//menampilkan
  }
  static void kalimat2(){//prosedure 2 dengan modifier static
    System.out.println("RPL no error");//menampilkan
  }
   void kalimat3(){//prosedure 3 tanpa modifier static
    System.out.println("RPL Running");//menampilkan
  }
  public static void main(String[] args) {//prosedure class main
    prosedure k= new prosedure();//memanggil prosedure ke main
    kalimat1();//memanggil prosedure 1
    kalimat2();//memanggil prosedure 2
    k.kalimat3();//memanggil prosedure 3 yang tidak menggunakan modifier static
  }
}
