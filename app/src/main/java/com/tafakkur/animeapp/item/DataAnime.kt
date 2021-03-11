package com.tafakkur.animeapp.item

import com.tafakkur.animeapp.R
import com.tafakkur.animeapp.data.Anime

object DataAnime {
    private val animeName = arrayOf(
            "100-man no inochi no Ue ni Ore wa Tatteiru",
            "Assault Lily: Bouquet",
            "Golden Kamuy S3",
            "Shingeki no Kyojin S4",
            "Jujutsu Kaisen",
            "Kamisama ni Natta Hi",
            "Dragon Quest: Dai no Daibouken",
            "King's Raid: Ishi wo Tsugumono-tachi",
            "Maoujou de Oyasumi",
            "Noblesse",
            "Ikebukuro West Gate Park",
            "Hanyou no Yashahime: Sengoku Otogizoushi"
    )
    private val animPoster = intArrayOf(
            R.drawable.poster_100man,
            R.drawable.poster_asaut,
            R.drawable.poster_golden,
            R.drawable.poster_snk,
            R.drawable.poster_jutsu,
            R.drawable.poster_kamisama,
            R.drawable.poster_dragon,
            R.drawable.poster_king,
            R.drawable.poster_maujou,
            R.drawable.poster_nobles,
            R.drawable.poster_ikeburo,
            R.drawable.poster_hanyo
    )
    private val releaseDate = arrayOf(
            "Oct 2, 2020",
            "Oct 2, 2020",
            "Oct 5, 2020",
            "Des 07, 2020",
            "Oct 3, 2020",
            "Oct 11, 2020",
            "Oct 9, 2020",
            "Oct 3, 2020",
            "Oct 6, 2020",
            "Okt 06, 2020",
            "Oct 6, 2020",
            "Oct 3, 2020"
    )
    private val animSinopsis = arrayOf(
            "Yotsuya Yuusuke bersama dengan teman sekelasnya Shindou Iu dan Hakozaki Kusue telah dipindahkan ke dunia aneh dan tidak dikenal yang dihuni oleh makhluk mitologi. Begitu mereka tiba, mereka bertemu seseorang yang menyebut dirinya Game Master yang kemudian memberi mereka pencarian waktu terbatas. Untuk membantu mereka dalam pencarian ini, dia juga menganugerahkan Shindou dan Hakozaki dengan peran sebagai Penyihir dan Prajurit sementara Yotsuya secara acak diberikan peran … seorang Petani ?!",
            "Umat manusia menghadapi kehancuran dari makhluk misterius yang dikenal sebagai “Huge.” Dunia berperang melawan Huge, dan mengembangkan anti-senjata “CHARM” (Counter Huge Arms) dengan menggabungkan sains dan sihir. CHARM bekerja lebih efektif jika digunakan oleh gadis remaja, dan mereka yang menggunakan senjata dipuja sebagai “Lilies”. The Lilies dilatih di akademi militer yang disebut “Gardens”, yang juga berfungsi sebagai pangkalan untuk melindungi dan menasihati orang. Ini adalah cerita tentang gadis-gadis yang ingin menjadi Lilies agar bisa melindungi Bumi.",
            "Di Hokkaido, ujung utara Jepang, Sugimoto berhasil selamat dalam perang Rusia-Jepang di era Meiji . Dengan julukan “Sugimoto yang abadi” yang dia dapat selama peperangan, saat ini dia sedang mencari harta karun berupa emas, yang dijuluki ‘gold rush’ demi mencari uang untuk menyelamatkan janda dan anak dari teman masa kecilnya yang gugur di medan perang. Selama perburuan emas ini, dia menemukan petunjuk lokasi disembunyikannya emas oleh para tahanan yang kabur. Dengan bekerja sama bersama seorang anak dari suku Ainu, yang sudah menyelamatkannya dari ganasnya iklim di utara, mereka menjelajah dan bertahan hidup dalam perlombaan melawan para penjahat untuk menemukan harta karun tersembunyi tersebut.",
            "Musim keempat ini akan menjadi musim terakhir dari serial anime Shingeki no Kyojin. Setelah berhasil sampai ke laut. Eren pun memiliki tujuan lain yang lebih besar. Untuk mengakhiri penderitaan bangsa Eldia. Eren pun membulatkan tekadnya untuk melakukan sesuatu terhadap bangsa lain yang membenci bangsa Eldia.",
            "Di dunia di mana iblis memakan manusia yang tidak menaruh curiga, fragmen dari iblis legendaris dan ditakuti Ryoumen Sukuna hilang dan berserakan. Jika ada iblis yang memakan bagian tubuh Sukuna, kekuatan yang mereka peroleh dapat menghancurkan dunia seperti yang kita ketahui. Untungnya, ada sekolah misterius Jujutsu Sorcerers yang ada untuk melindungi keberadaan genting dari makhluk hidup dari undead!.",
            "Narukami Youta adalah seorang pelajar tahun terakhir SMA yang sedang mengisi libur musim panas seperti pemuda ABG lainnya, terutama menyiapkan diri mengikuti ujian masuk universitas. Tetapi ketika seorang gadis kecil yang mengaku sebagai Odin mendatanginya dan mengaku sebagai dewa yang meramalkan dunia akan kiamat dalam 30 hari, musim panasnya pun seketika langsung terasa berbeda.",
            "Dahulu kala, ada pendekar pedang yang gagah berani yang kemudian dikenal hanya sebagai “pahlawan”. Ada iblis yang menyebabkan orang menderita. Pahlawan dan teman-temannya tiba untuk menantang iblis ke pertempuran dan dengan menggabungkan kekuatan mereka, pertempuran itu berakhir dengan cepat. Dengan tidak ada orang di sekitar yang menimbulkan masalah, pulau itu menjadi tempat yang tenang di mana semua orang bisa hidup bersama dalam damai.",
            "Sudah 100 tahun sejak Raja Kyle menguburkan Ang Mundo. Sekarang dalam masa damai, ksatria magang Kasel menikmati hidupnya tanpa khawatir. Nasibnya mulai berubah, bagaimanapun, dengan berita tentang penampakan setan yang memenuhi lingkungan itu. Dipandu oleh orang bijak, Kasel menemukan teman-teman yang dapat diandalkan dan memulai misinya untuk mencari pedang suci, yang mampu membunuh musuh barunya.",
            "ssttt! Putri Syalis sedang tidur nyenyak, dengan alis panjangnya yang terpejam dengan suara lirihnya sambil bergumam. Dahulu kala, ketika manusia dan iblis hidup berdampingan, sang raja iblis malah justru menculik dan mengurung putri manusia di dalam kastilnya.",
            "Dahulu kala terdapat Nobles, ras makhluk hidup yang abadi. Mereka dianggap sebagai penguasa dan Dewa. Di antara mereka ada yang disebut “Noblesse” yaitu sosok individu terkuat yang diselimuti misteri. Dan individu itu bernama Cadis Etrama di Raizel. Setelah ia bangkit kembali dari tidur panjangnya selama 820 tahun, di Korea Utara Rai berniat mencari pelayan setianya yaitu Frankenstein yang pada zaman modern diketahui kalau dia menjadi direktur dari SMA Ye Ran. Untuk memahami perabadan modern, Rai pun masuk sekolah sebagai siswa SMA.",
            "Ikebukuro yang sarat kejahatan adalah surga bagi geng-geng kekerasan, Yakuza, dan rumah bagi Makoto Majima. Untuk melindungi teman-temannya, pemecah masalah karismatik ini menengahi perselisihan di antara faksi yang bertikai — bahkan memperbaiki masalah yang tidak bisa dilakukan polisi. Tetapi ketika gelombang kekerasan yang meningkat mengakibatkan Makoto kehilangan orang yang dicintainya, dapatkah dia keluar dari badai, atau akankah dia tenggelam dalam semua tumpahan darah yang membanjiri jalan-jalannya?",
            "Di Feodal Jepang, si kembar Half-Demon Towa dan Setsuna dipisahkan satu sama lain selama kebakaran hutan. Saat putus asa mencari adik perempuannya, Towa mengembara ke terowongan misterius yang mengirimnya ke Jepang saat ini, di mana dia ditemukan dan dibesarkan oleh saudara laki-laki Kagome Higurashi, Souta, dan keluarganya."
    )

    val listData: ArrayList<Anime>
    get() {
        val list = arrayListOf<Anime>()
        for (position in animeName.indices){
            val anime = Anime()
            anime.title = animeName[position]
            anime.sinopsis = animSinopsis[position]
            anime.poster = animPoster[position]
            anime.releaseDate = releaseDate[position]
            list.add(anime)
        }
        return list
    }

}