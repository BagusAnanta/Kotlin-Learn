
// TODO: Apa itu concurrency ?
// Concurrency itu adalah proses yang dijalankan secara bersamaan dalam suatu sistem. jadi prosesor akan menjalankan tugas secara bersamaan dalam satu waktu dan dengan 1 core saja
// TODO: Misalnya, kita barista kopi dan terdapat pelanggan dengan pesanan berbeda, kita bisa langsung buat secara bersamaan pesanannya tanpa perlu satu satu dibuat

// TODO: Concurrency Scema
/*
* Barista (Kita) -> Pelangan1(Cappucino),Pelangan2(Kopi Pait),Pelangan3(Tea),Pelangan4(Lemon Tea),Pelangan5(Coffe Late),Pelangan6(Ice Coffe)
*
*Dengan Concurrency -> Pesanan semua pelanggan akan dikerjakan secara bersamaan dan diproses lebih dari satu pesanan oleh barista,dibagi dengan masing langkah langkah yang berbeda dan dikerjakan secara bersamaan
*
* Barista (Kita) Say : Oke i'm make Cappucino,Kopi Pait,Tea,Lemon Tea,Coffe late,Ice Tea in same times
* */

// TODO: Apa itu Parallelism ?
// Parallelism adalah proses yang dijalankan secara bersamaan dalam satu waktu, namun berbeda dengan concurrency dia bakan membagi kerjaanya dengan core yang lain bisa 2 3 atau 4 core
// TODO: Misal, kita barista kopi dan terdapat pelangan yang sangat banyak dengan pesanan yang berbeda, apabila kita punya teman barista kita bisa membagi tugas kita ke teman barista kita

// TODO: Parallelism Scema
/*
* Barista (Kita) -> Pelangan1(Cappucino),Pelangan2(Kopi Pait),Pelangan3(Tea),Pelangan4(Lemon Tea),Pelangan5(Coffe Late),Pelangan6(Ice Coffe)
*
* Dengan Parallelism -> Semua pesanan akan dibagi rata oleh Barista (Kita) dan Barista (Kawan) namun walaupun dibagi kita tetap harus menjalankan tugas secara langsung atau menjalankan tugasnya secara bersamaan
*
* Barista (Kita) -> Aku kerjain Pelanggan1..Pelanggan3 kamu kerjain Pelanggan4..Pelanggan6 Oke
* Barista (Teman) -> Oke sipp
*
* kerjanya jadi gini
*
* Barista (Kita) (Oke Cappucino,Kopi Pait,Tea) -> Pelanggan1..Pelanggan3
* Barista (Teman) (Oke Lemon Tea,Coffe late,Ice) -> Pelanggan4..Pelanggan6
*
* */
