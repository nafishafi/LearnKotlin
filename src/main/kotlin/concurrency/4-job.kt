package concurrency

// Sebagai developer, tentunya kita menginginkan tetap bisa mengakses fungsi yang sudah dijalankan.
// Misalnya, ketika kita ingin membatalkan tugasnya atau memberikan instruksi tambahan ketika fungsi tersebut telah mencapai kondisi tertentu.
// Untuk bisa melakukannya, Anda perlu memahami tentang Job dan Deferred pada coroutines.

// 3 Properti Job:
// 1. isActive = Sebuah properti yang menunjukkan ketika sebuah job sedang aktif.
// 2. isCompleted = Sebuah properti yang menunjukkan ketika sebuah job telah selesai.
// 3. isCancelled = Sebuah properti yang menunjukkan ketika sebuah job telah dibatalkan.

// State pada Job:
// New = Keadaan di mana sebuah job telah diinisialisasi namun belum pernah dijalankan.
// Active = Sebuah job akan memiliki status aktif ketika ia sedang berjalan. Dalam hal ini, job yang sedang ditangguhkan (suspended job) juga termasuk ke dalam job yang aktif.
// Completed = Ketika job sudah tidak berjalan lagi. Ini berlaku untuk job yang berakhir secara normal, dibatalkan, ataupun karena suatu pengecualian.
// Cancelling = Suatu kondisi ketika fungsi cancel() dipanggil pada job yang sedang aktif dan memerlukan waktu untuk pembatalan tersebut selesai.
// Cancelled = Keadaan yang dimiliki oleh sebuah job yang sudah berhasil dibatalkan. Perlu diketahui bahwa job yang dibatalkan juga dapat dianggap sebagai Completed job.
