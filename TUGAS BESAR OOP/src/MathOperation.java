import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class MathOperation {
    public static void main(String[] args) {
        ArrayList<String> namauser = new ArrayList<>();
        ArrayList<Integer> skor = new ArrayList<>();
        Scanner input1 = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        Random random1 = new Random();
        Random random2 = new Random();
        String cariY;

        do {
            System.out.println("Masukkan Nama: \n0. Exit");
            cariY = input1.nextLine();
            namauser.add(cariY);
            int Nilai = 0;
            int CekGameOver = 0;
            int akumulasi[] = new int[6];
            int NilaiPasJalan = 0;
            int jaw1;
            int jaw2;
            int jaw3;
            int jaw4;
            int jaw5;


            if (!("0").equals(cariY)) {
                String nextLevel;
                int PilihLevel = 1;
                System.out.println("\nSelamat Datang " + cariY);
                
                do {
                    int Kout;
                    System.out.println("# Level " + PilihLevel);
                    int StarNilaiO = PilihLevel-1;
                    int AngkaAcak1 = random1.nextInt(10);
                    int AngkaAcak2 = random2.nextInt(10);
                    int AngkaAcak3 = random2.nextInt(10);
                    int AngkaAcak4 = random2.nextInt(10);
                    int AngkaAcak5 = random2.nextInt(10);
                    int Kurang = 5;

                    for (Kout = 0; Kout < 5; Kout++) {
                            
                        if (PilihLevel == 1){
                            System.out.println("Silahkan Hitung hasil dari "+ AngkaAcak1 + " + " + AngkaAcak2 + " = ?");
                            System.out.println("Anda mempunyai kesempatan menebak "+ Kurang + " kali.");
                            System.out.println("Masukan tebakan Anda : ");
                            jaw1 = input2.nextInt(); 

                            if (jaw1 == AngkaAcak1+AngkaAcak2) { 
                                if (Kout == 0) {
                                    NilaiPasJalan =  100; 
                                } else if (Kout == 1) {
                                    NilaiPasJalan =  70; 
                                } else if (Kout == 2) {
                                    NilaiPasJalan =  50; 
                                } else if (Kout == 3) {
                                    NilaiPasJalan = 30; 
                                } else {
                                    NilaiPasJalan = 0; 
                                }

                                int NeTebak = Kout + 1;
                                System.out.println("\nSelamat Anda berhasil menebak!! \nAngka dalam " + NeTebak + " kali tebakan. \n-------Skor anda adalah " + NilaiPasJalan+"-------");
                                break;
                            }
                                
                            else if (jaw1 != AngkaAcak1+AngkaAcak2){ 
                                Kurang--;
                                System.out.println("Kesempatan anda "+ Kurang + " kali lagi");
                            }

                            if (Kout == 4) { 
                                System.out.println("GAMEOVER! Anda Gagal jawabannya : " + AngkaAcak1 + " + " + AngkaAcak2 + " = "+ (AngkaAcak1+AngkaAcak2));
                                CekGameOver++; 
                            }
                        }

                        else if (PilihLevel == 2 ) {
                            System.out.println("Silahkan Hitung hasil dari "+ AngkaAcak2 + " + " + AngkaAcak3 + " + " + AngkaAcak4 + " = ?");
                            System.out.println("Anda mempunyai kesempatan menebak "+ Kurang +" kali.");
                            System.out.println("Masukan tebakan Anda : ");
                            jaw2 = input2.nextInt(); 
                            if (jaw2 == AngkaAcak2 + AngkaAcak3 + AngkaAcak4) { 
                                if (Kout == 0) {
                                    NilaiPasJalan = 100; 
                                } else if (Kout == 1) {
                                    NilaiPasJalan = 70; 
                                } else if (Kout == 2) {
                                    NilaiPasJalan = 50; 
                                } else if (Kout == 3) {
                                    NilaiPasJalan = 30; 
                                } else {
                                    NilaiPasJalan = 0; 
                                }

                                int NeTebak = Kout + 1;
                                System.out.println("\nSelamat Anda berhasil menebak!! \nAngka dalam " + NeTebak + " kali tebakan. \n-------Skor anda adalah " + NilaiPasJalan+"-------");
                                break;
                            }
                            else if (jaw2 != AngkaAcak2 + AngkaAcak3 + AngkaAcak4){ 
                                Kurang--;
                                System.out.println("Kesempatan anda "+ Kurang + " kali lagi");
                            }

                            if (Kout == 4) { 
                                System.out.println("GAMEOVER! Anda Gagal jawabannya : " + AngkaAcak2 + " + " + AngkaAcak3 + " + " + AngkaAcak4 + " = "+ (AngkaAcak2 + AngkaAcak3 + AngkaAcak4));
                                CekGameOver++; 
                            }
                        }

                        else if (PilihLevel == 3 ) {
                            System.out.println("Silahkan Hitung hasil dari "+ AngkaAcak4 + " x " + AngkaAcak5 + " = ?");
                            System.out.println("Anda mempunyai kesempatan menebak 5 kali.");
                            System.out.println("Masukan tebakan Anda : ");
                            jaw3 = input2.nextInt(); 
                            if (jaw3 == AngkaAcak4 * AngkaAcak5) { 
                                if (Kout == 0) {
                                    NilaiPasJalan = 100; 
                                } else if (Kout == 1) {
                                    NilaiPasJalan = 70; 
                                } else if (Kout == 2) {
                                    NilaiPasJalan = 50; 
                                } else if (Kout == 3) {
                                    NilaiPasJalan = 30; 
                                } else {
                                    NilaiPasJalan = 0; 
                                }
                                int NeTebak = Kout + 1;
                                System.out.println("\nSelamat Anda berhasil menebak!! \nAngka dalam " + NeTebak + " kali tebakan. \n-------Skor anda adalah " + NilaiPasJalan+"-------");
                                break;
                            }

                            else if (jaw3 != AngkaAcak4 * AngkaAcak5){ 
                                Kurang--;
                                System.out.println("Kesempatan anda "+ Kurang + " kali lagi");
                            }

                            if (Kout == 4) { 
                                System.out.println("GAMEOVER! Anda Gagal jawaban : " + AngkaAcak4 + " x " + AngkaAcak5 + " = " + (AngkaAcak4 * AngkaAcak5));
                                CekGameOver++;
                            }
                        }

                        else if (PilihLevel == 4 ) {
                            System.out.println("Silahkan Hitung hasil dari "+ AngkaAcak5 + " x " + AngkaAcak3 + " + " + AngkaAcak1 + " = ?");
                            System.out.println("Anda mempunyai kesempatan menebak 5 kali.");
                            System.out.println("Masukan tebakan Anda : ");
                            jaw4 = input2.nextInt(); 
                            if (jaw4 == AngkaAcak5 * AngkaAcak3 + AngkaAcak1) { 
                                if (Kout == 0) {
                                    NilaiPasJalan = 100; 
                                } else if (Kout == 1) {
                                    NilaiPasJalan = 70; 
                                } else if (Kout == 2) {
                                    NilaiPasJalan = 50; 
                                } else if (Kout == 3) {
                                    NilaiPasJalan = 30; 
                                } else {
                                    NilaiPasJalan = 0; 
                                }
                                int NeTebak = Kout + 1;
                                System.out.println("\nSelamat Anda berhasil menebak!! \nAngka dalam " + NeTebak + " kali tebakan. \n-------Skor anda adalah " + NilaiPasJalan+"-------");
                                break;
                            }

                            else if (jaw4 != AngkaAcak5 * AngkaAcak3 + AngkaAcak1){ 
                                Kurang--;
                                System.out.println("Kesempatan anda "+ Kurang + " kali lagi");
                            }
                                
                            if (Kout == 4) { 
                                System.out.println("GAMEOVER! Anda Gagal jawaban : " + AngkaAcak5 + " x "+ AngkaAcak3 + " + " + AngkaAcak1+" = "+ (AngkaAcak5 * AngkaAcak3 + AngkaAcak1));
                                CekGameOver++; 
                            }
                        }

                        else if (PilihLevel == 5 ) {
                            System.out.println("Silahkan Hitung hasil dari "+ AngkaAcak5 + " x " + AngkaAcak3 + " x " + AngkaAcak1 + " = ?");
                            System.out.println("Anda mempunyai kesempatan menebak 5 kali.");
                            System.out.println("Masukan tebakan Anda : ");
                            jaw5 = input2.nextInt(); 
                            if (jaw5 == AngkaAcak5 * AngkaAcak3 * AngkaAcak1) { 
                                if (Kout == 0) {
                                    NilaiPasJalan = 100; 
                                } else if (Kout == 1) {
                                    NilaiPasJalan = 70; 
                                } else if (Kout == 2) {
                                    NilaiPasJalan =  50; 
                                } else if (Kout == 3) {
                                    NilaiPasJalan =  30; 
                                } else {
                                    NilaiPasJalan = 0; 
                                }
                                int NeTebak = Kout + 1;
                                System.out.println("\nSelamat Anda berhasil menebak!! \nAngka dalam " + NeTebak + " kali tebakan. \n-------Skor anda adalah " + NilaiPasJalan+"-------");
                                break;
                            }

                            else if (jaw5 != AngkaAcak5 * AngkaAcak3 * AngkaAcak1){ 
                                Kurang--;
                                System.out.println("Kesempatan anda "+ Kurang + " kali lagi");
                            }

                            if (Kout == 4) { 
                                System.out.println("GAMEOVER! Anda Gagal jawaban : " + AngkaAcak5 + " x " + AngkaAcak3 + " x " + AngkaAcak1 + " = " + (AngkaAcak5 * AngkaAcak3 * AngkaAcak1));
                                CekGameOver++; 
                            }
                        }
                    }

                    if (CekGameOver > 0) {
                        break;
                    }

                    if (PilihLevel == 5) { 
                        akumulasi[StarNilaiO] = NilaiPasJalan;
                        break;
                    } else {
                        akumulasi[StarNilaiO] = NilaiPasJalan; 
                        System.out.println("Tekan enter untuk lanjut ke Level berikutnya atau ketik 'exit' untuk keluar : ");
                        nextLevel = input1.nextLine();
                        PilihLevel++; 
                    }

                } while (!"exit".equals(nextLevel));
            }

            for (int rO = 0; rO < 5; rO++) { 
                Nilai = Nilai + akumulasi[rO];
            }
            skor.add(Nilai); 
            if (!"0".equals(cariY)) { 

                System.out.println("\n---------------\n     SCORE");
                int xSemen; 
                int xJumSemen = namauser.size();

                for (xSemen = 0; xSemen < xJumSemen; xSemen++) { 
                    System.out.println(namauser.get(xSemen) + " : " + (skor.get(xSemen)));
                }
                System.out.println("---------------");
            }

        } while (!"0".equals(cariY)); 
        int jumPemain = namauser.size(); 
        System.out.println("=================================");
        System.out.println("FINAL SCORE");
        int l;
        for (l = 0; l < jumPemain - 1; l++) {
            System.out.println(namauser.get(l) + " : " + skor.get(l)); 
        }
        System.out.println("=================================");
    }
}