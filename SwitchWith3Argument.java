package pkgswitch.with.pkg3argument;

/**
 *
 * @author 1337
 */
public class SwitchWith3Argument {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Usage : java SwitchWith3Argument <tgl> <bln> <tahun>");
            System.exit(1);
        }
        
        int tgl   = (Integer.valueOf(args[0])).intValue();
        int bulan = (Integer.valueOf(args[1])).intValue();
        int tahun = (Integer.valueOf(args[2])).intValue();
        
        switch(bulan) {
            case 1: System.out.println(tgl + " Januari " + bulan); break;
            case 2: System.out.println(tgl + " Februari " + bulan); break;
            case 3: System.out.println(tgl + " Maret " + bulan); break;
            case 4: System.out.println(tgl + " April " + bulan); break;
            case 5: System.out.println(tgl + " Mei " + bulan); break;
            case 6: System.out.println(tgl + " Juni " + bulan); break;
            case 7: System.out.println(tgl + " Juli " + bulan); break;
            case 8: System.out.println(tgl + " Agustus " + bulan); break;
            case 9: System.out.println(tgl + " September " + bulan); break;
            case 10: System.out.println(tgl + " Oktober " + bulan); break;
            case 11: System.out.println(tgl + " November " + bulan); break;
            case 12: System.out.println(tgl + " Desember " + bulan); break;
            default: System.out.println("Bulan Tidak Valid."); break;
        }
    }
}
