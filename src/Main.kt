fun main() {
    val todoList = mutableListOf<String>()
    while (true) {
        println("\n=== Aplikasi To-Do List ===")
        println("1. Lihat daftar tugas")
        println("2. Tambah tugas")
        println("3. Hapus tugas")
        println("4. Keluar")
        print("Pilih menu: ")

        when (readLine()?.toIntOrNull()) {
            1 -> {
                if (todoList.isEmpty()) {
                    println("\nDaftar tugas kosong.")
                } else {
                    println("\nDaftar Tugas:")
                    todoList.forEachIndexed { index, task ->
                        println("${index + 1}. $task")
                    }
                }
            }
            2 -> {
                print("\nMasukkan tugas baru: ")
                val task = readLine()
                if (!task.isNullOrBlank()) {
                    todoList.add(task)
                    println("Tugas berhasil ditambahkan!")
                } else {
                    println("Tugas tidak boleh kosong.")
                }
            }
            3 -> {
                if (todoList.isEmpty()) {
                    println("\nDaftar tugas kosong.")
                } else {
                    println("\nDaftar Tugas:")
                    todoList.forEachIndexed { index, task ->
                        println("${index + 1}. $task")
                    }
                    print("Masukkan nomor tugas yang ingin dihapus: ")
                    val taskIndex = readLine()?.toIntOrNull()
                    if (taskIndex != null && taskIndex in 1..todoList.size) {
                        val removedTask = todoList.removeAt(taskIndex - 1)
                        println("Tugas '$removedTask' berhasil dihapus!")
                    } else {
                        println("Nomor tugas tidak valid.")
                    }
                }
            }
            4 -> {
                println("\nTerima kasih telah menggunakan aplikasi!")
                break
            }
            else -> println("\nPilihan tidak valid. Silakan coba lagi.")
        }
    }
}
