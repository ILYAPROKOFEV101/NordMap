package com.ilya.nordmap.Map

import MapMarker_DATA

val Openmarkers_map = listOf(
    MapMarker_DATA(
        id = 1,
        name = "Кижи",
        type = "Музей-заповедник",
        lon = 35.2035,
        lat = 62.0663,
        description = "Уникальный музей деревянного зодчества на острове в Онежском озере.",
        visitTime = "09:00 - 19:00",
        isVisited = false,
        imageUrl = "https://example.com/kizhi.jpg",
        queryPrompt = "Как добраться до острова Кижи?"
    ),

    MapMarker_DATA(
        id = 2,
        name = "Водопад Кивач",
        type = "Природный объект",
        lon = 33.9836,
        lat = 62.2614,
        description = "Один из крупнейших равнинных водопадов Европы.",
        visitTime = "08:00 - 20:00",
        isVisited = false,
        imageUrl = "https://avatars.mds.yandex.net/get-entity_search/1244417/960692261/orig",
        queryPrompt = "Как найти водопад Кивач?"
    ),

    MapMarker_DATA(
        id = 3,
        name = "Рускеальский горный парк",
        type = "Парк",
        lon = 30.5813,
        lat = 61.9342,
        description = "Живописный горный парк с мраморными каньонами.",
        visitTime = "09:00 - 21:00",
        isVisited = false,
        imageUrl = "https://avatars.mds.yandex.net/i?id=ad2f6b580a474aae3424fb98036723cff05d68a1-10637439-images-thumbs&n=13",
        queryPrompt = "Где находится Рускеала?"
    ),

    MapMarker_DATA(
        id = 4,
        name = "Беломорские петроглифы",
        type = "Исторический памятник",
        lon = 34.7667,
        lat = 64.5200,
        description = "Древние наскальные рисунки, созданные тысячи лет назад.",
        visitTime = "10:00 - 18:00",
        isVisited = false,
        imageUrl = "https://avatars.dzeninfra.ru/get-zen_doc/3855260/pub_60ca0956f7ddc664b15765a4_60ca12a08df8dd3fc99c2eae/scale_1200",
        queryPrompt = "Как посмотреть Беломорские петроглифы?"
    ),

    MapMarker_DATA(
        id = 5,
        name = "Шхеры Ладожского озера",
        type = "Природный объект",
        lon = 30.2500,
        lat = 61.0000,
        description = "Уникальный архипелаг с сотнями островов.",
        visitTime = "Круглосуточно",
        isVisited = false,
        imageUrl = "https://avatars.dzeninfra.ru/get-zen_doc/9865229/pub_64c964a102606d249337f043_64c966d09d8a8d60a6c7b54f/scale_1200",
        queryPrompt = "Где находятся Ладожские шхеры?"
    ),

    MapMarker_DATA(
        id = 6,
        name = "Петрозаводская набережная",
        type = "Набережная",
        lon = 34.3494,
        lat = 61.7858,
        description = "Прекрасное место для прогулок вдоль Онежского озера.",
        visitTime = "Круглосуточно",
        isVisited = true,
        imageUrl = "https://avatars.mds.yandex.net/i?id=c5723cf2a579111c47011ae09771eed3_l-5210262-images-thumbs&n=13",
        queryPrompt = "Как добраться до набережной Петрозаводска?"
    ),

    MapMarker_DATA(
        id = 7,
        name = "Валаам",
        type = "Монастырь",
        lon = 30.9453,
        lat = 61.3716,
        description = "Знаменитый православный монастырь на острове Валаам.",
        visitTime = "06:00 - 20:00",
        isVisited = false,
        imageUrl = "https://rk.karelia.ru/wp-content/uploads/2020/09/7yoky06sdw08gkg44o-1024x575.jpg",
        queryPrompt = "Как добраться на Валаам?"
    ),

    MapMarker_DATA(
        id = 8,
        name = "Национальный парк Паанаярви",
        type = "Национальный парк",
        lon = 30.5692,
        lat = 66.0483,
        description = "Один из самых красивых парков Карелии с горными озерами и вершинами.",
        visitTime = "Круглосуточно",
        isVisited = false,
        imageUrl = "https://avatars.mds.yandex.net/i?id=441d258f6d0613eb620400f06c16c8e499902694-10247400-images-thumbs&n=13",
        queryPrompt = "Что посмотреть в Паанаярви?"
    ),

    MapMarker_DATA(
        id = 9,
        name = "Онежское озеро",
        type = "Природный объект",
        lon = 35.8667,
        lat = 61.9500,
        description = "Одно из крупнейших озер Европы с богатой флорой и фауной.",
        visitTime = "Круглосуточно",
        isVisited = true,
        imageUrl = "https://avatars.mds.yandex.net/i?id=7e9f1d30158f4b0a096c32df4b5def4d_l-4628413-images-thumbs&n=13",
        queryPrompt = "Какие интересные места есть на Онежском озере?"
    ),

    MapMarker_DATA(
        id = 10,
        name = "Церковь Ильи Пророка в Киндасово",
        type = "Исторический памятник",
        lon = 34.0437,
        lat = 61.8461,
        description = "Деревянная церковь, построенная в традиционном стиле.",
        visitTime = "09:00 - 18:00",
        isVisited = false,
        imageUrl = "https://ar.culture.ru/attachments/attachment/preview/59e9e5bb489597cc293f2db6-preview.jpg",
        queryPrompt = "Как найти церковь в Киндасово?"
    ),

    MapMarker_DATA(
        id = 11,
        name = "Тохминские водопады",
        type = "Природный объект",
        lon = 33.6317,
        lat = 61.9611,
        description = "Живописные водопады на реке Тохма.",
        visitTime = "Круглосуточно",
        isVisited = false,
        imageUrl = "https://avatars.mds.yandex.net/i?id=0bb7674b1d925f6cc8a3852d1b1dbdf42805e90e-8607024-images-thumbs&n=13",
        queryPrompt = "Как доехать до Тохминских водопадов?"
    ),


    MapMarker_DATA(
        id = 12,
        name = "Гора Воттоваара",
        type = "Природный объект",
        lon = 32.6612,
        lat = 63.0734,
        description = "Мистическая гора с необычными каменными сооружениями.",
        visitTime = "Круглосуточно",
        isVisited = false,
        imageUrl = "https://rk.karelia.ru/wp-content/uploads/2020/04/2k7qhqwn45gk88s04ck-e1587997766715.jpg",
        queryPrompt = "Как найти гору Воттоваара?"
    ),

    MapMarker_DATA(
        id = 13,
        name = "Кандапожская ГЭС",
        type = "Инженерный объект",
        lon = 34.2083,
        lat = 62.1632,
        description = "Гидроэлектростанция на реке Суной, известная своей историей.",
        visitTime = "10:00 - 17:00",
        isVisited = false,
        imageUrl = "https://avatars.mds.yandex.net/i?id=fdc11c08ae1d9f242a3e056d225fbd653e334d4c-12155438-images-thumbs&n=13",
        queryPrompt = "Можно ли посетить Кандапожскую ГЭС?"
    ),

    MapMarker_DATA(
        id = 14,
        name = "Музей изобразительных искусств Карелии",
        type = "Музей",
        lon = 34.3494,
        lat = 61.7888,
        description = "Крупнейший художественный музей региона.",
        visitTime = "10:00 - 18:00",
        isVisited = false,
        imageUrl = "https://artmuseum.karelia.ru/wp-content/uploads/2023/07/11258999086580417_b417.jpg",
        queryPrompt = "Что посмотреть в музее изобразительных искусств Карелии?"
    ),

    MapMarker_DATA(
        id = 15,
        name = "Парк Тысячелетия Петрозаводска",
        type = "Парк",
        lon = 34.3597,
        lat = 61.7865,
        description = "Современный парк, посвященный тысячелетию города Петрозаводска.",
        visitTime = "08:00 - 22:00",
        isVisited = true,
        imageUrl = "https://avatars.mds.yandex.net/get-altay/481843/2a000001628702081ea111521426bd098263/XXL",
        queryPrompt = "Какой транспорт идет в парк Тысячелетия?"
    ),

// Архангельская область
    MapMarker_DATA(
        id = 16,
        name = "Соловецкие острова",
        type = "Монастырь",
        lon = 35.7084,
        lat = 65.0919,
        description = "Исторический монастырь и объект Всемирного наследия ЮНЕСКО.",
        visitTime = "06:00 - 20:00",
        isVisited = false,
        imageUrl = "https://avatars.mds.yandex.net/i?id=462666611cb4353c274dfe59d46c87afaf48190c-12625448-images-thumbs&n=13",
        queryPrompt = "Как попасть на Соловецкие острова?"
    ),

    MapMarker_DATA(
        id = 17,
        name = "Архангельский краеведческий музей",
        type = "Музей",
        lon = 40.5175,
        lat = 64.5398,
        description = "Музей, рассказывающий о культуре и истории Архангельской области.",
        visitTime = "10:00 - 18:00",
        isVisited = false,
        imageUrl = "https://avatars.mds.yandex.net/i?id=97ef3cceb583ab45ed282ee8fa6f0cc8_l-5716853-images-thumbs&n=13",
        queryPrompt = "Какие экспозиции есть в Архангельском краеведческом музее?"
    ),

    MapMarker_DATA(
        id = 18,
        name = "Кенозерский национальный парк",
        type = "Национальный парк",
        lon = 38.2943,
        lat = 62.1882,
        description = "Заповедный уголок с уникальной природой и культурными памятниками.",
        visitTime = "Круглосуточно",
        isVisited = false,
        imageUrl = "Кенозерский национальный парк",
        queryPrompt = "Что посмотреть в Кенозерском национальном парке?"
    ),

    MapMarker_DATA(
        id = 19,
        name = "Онежский маяк",
        type = "Исторический памятник",
        lon = 39.4749,
        lat = 63.9050,
        description = "Старинный маяк на побережье Белого моря.",
        visitTime = "09:00 - 17:00",
        isVisited = false,
        imageUrl = "https://avatars.mds.yandex.net/i?id=398331fed8d73a8fed7d862f993156300436b270-12406511-images-thumbs&n=13",
        queryPrompt = "Как добраться до Онежского маяка?"
    ),

    MapMarker_DATA(
        id = 20,
        name = "Двина-Ландшафтный парк",
        type = "Парк",
        lon = 40.5742,
        lat = 64.5461,
        description = "Природный парк на берегу реки Северной Двины.",
        visitTime = "08:00 - 22:00",
        isVisited = false,
        imageUrl = "https://avatars.mds.yandex.net/i?id=1269893e7e6c97e6fd411251a5ff71e25d7750fd-5086868-images-thumbs&n=13",
        queryPrompt = "Что интересного в парке Двина?"
    ),

// Мурманская область
    MapMarker_DATA(
        id = 21,
        name = "Северное сияние в Мурманске",
        type = "Природное явление",
        lon = 33.0868,
        lat = 68.9707,
        description = "Популярное место для наблюдения за северным сиянием.",
        visitTime = "Зависит от сезона",
        isVisited = false,
        imageUrl = "https://i.pinimg.com/736x/60/4a/4d/604a4dd628e3fe2b8a495f28cb2ffbdc.jpg",
        queryPrompt = "Где лучше наблюдать северное сияние в Мурманске?"
    ),

    MapMarker_DATA(
        id = 22,
        name = "Териберка",
        type = "Деревня",
        lon = 35.1503,
        lat = 69.1578,
        description = "Известная деревня, прославившаяся фильмом 'Левиафан'.",
        visitTime = "Круглосуточно",
        isVisited = false,
        imageUrl = "https://avatars.mds.yandex.net/i?id=e37dc0710de7a3d97b5e16d9c2a3a67e_l-10375634-images-thumbs&n=13",
        queryPrompt = "Что посмотреть в Териберке?"
    ),

    MapMarker_DATA(
        id = 23,
        name = "Кольский полуостров",
        type = "Природный объект",
        lon = 33.0000,
        lat = 68.0000,
        description = "Обширный регион с суровой природой и уникальными ландшафтами.",
        visitTime = "Круглосуточно",
        isVisited = false,
        imageUrl = "https://avatars.mds.yandex.net/i?id=fbd0e7ae4f62c66c21da9913809021dd447dd3d8-4570072-images-thumbs&n=13",
        queryPrompt = "Какие маршруты на Кольском полуострове?"
    ),

    MapMarker_DATA(
        id = 24,
        name = "Атомный ледокол 'Ленин'",
        type = "Музей",
        lon = 33.0571,
        lat = 68.9653,
        description = "Первый в мире атомный ледокол, превращенный в музей.",
        visitTime = "09:00 - 17:00",
        isVisited = false,
        imageUrl = "https://avatars.mds.yandex.net/i?id=432271c2776c242338a7c24560e1cf72caa4fed3-12927189-images-thumbs&n=13",
        queryPrompt = "Как попасть на экскурсию по ледоколу 'Ленин'?"
    ),

    // Ненецкий автономный округ
    MapMarker_DATA(
        id = 25,
        name = "Заповедник Ненецкий",
        type = "Заповедник",
        lon = 54.0000,
        lat = 68.0000,
        description = "Охраняемая природная территория с уникальной арктической флорой и фауной.",
        visitTime = "Круглосуточно",
        isVisited = false,
        imageUrl = "https://avatars.mds.yandex.net/i?id=4c9cbf41f5a481ba4060d08bab77cc0615bfa3fa-10811924-images-thumbs&n=13",
        queryPrompt = "Как посетить заповедник Ненецкий?"
    ),

    MapMarker_DATA(
        id = 26,
        name = "Город Нарьян-Мар",
        type = "Город",
        lon = 53.0865,
        lat = 67.6373,
        description = "Столица Ненецкого автономного округа с богатой культурой и историей.",
        visitTime = "Круглосуточно",
        isVisited = true,
        imageUrl = "https://avatars.mds.yandex.net/i?id=895ef1165cc8307d858f03ba601dca6ddd32d201-5869256-images-thumbs&n=13",
        queryPrompt = "Что посмотреть в Нарьян-Маре?"
    ),

    MapMarker_DATA(
        id = 27,
        name = "Водопад Каменный Бор",
        type = "Природный объект",
        lon = 53.9411,
        lat = 68.1286,
        description = "Живописный водопад в окружении дикой природы.",
        visitTime = "Круглосуточно",
        isVisited = false,
        imageUrl = "https://a.d-cd.net/26d9339s-1920.jpg",
        queryPrompt = "Как найти водопад Каменный Бор?"
    ),

    MapMarker_DATA(
        id = 28,
        name = "Хребет Пай-Хой",
        type = "Горный хребет",
        lon = 57.0000,
        lat = 68.5000,
        description = "Горный хребет на востоке Европы, граница Ненецкого округа и Ямала.",
        visitTime = "Круглосуточно",
        isVisited = false,
        imageUrl = "https://avatars.dzeninfra.ru/get-zen_doc/8288376/pub_645b3d26c93abd4ad22c06b5_645b3d4ac93abd4ad22c22b1/scale_1200",
        queryPrompt = "Какие маршруты доступны на хребте Пай-Хой?"
    ),

    MapMarker_DATA(
        id = 29,
        name = "Остров Вайгач",
        type = "Природный объект",
        lon = 59.0000,
        lat = 69.7500,
        description = "Остров между Баренцевым и Карским морями, известный дикой природой.",
        visitTime = "Круглосуточно",
        isVisited = false,
        imageUrl = "https://avatars.mds.yandex.net/i?id=ff8bc3d5c88752cd06d62d48d8e4ae0f_l-5210052-images-thumbs&n=13",
        queryPrompt = "Как добраться до острова Вайгач?"
    ),

// Ямало-Ненецкий автономный округ
    MapMarker_DATA(
        id = 30,
        name = "Национальный парк 'Полярный Урал'",
        type = "Национальный парк",
        lon = 66.0000,
        lat = 66.0000,
        description = "Природный парк с горами, реками и нетронутыми ландшафтами.",
        visitTime = "Круглосуточно",
        isVisited = false,
        imageUrl = "https://cdnn1.inosmi.ru/img/24550/65/245506510_0:0:0:0_1240x0_80_0_0_e2cc2fc2065a0907b997b893626d9d6e.jpg",
        queryPrompt = "Что посмотреть в парке 'Полярный Урал'?"
    ),

    MapMarker_DATA(
        id = 31,
        name = "Салехард",
        type = "Город",
        lon = 66.5333,
        lat = 66.5298,
        description = "Единственный город в мире, расположенный на Полярном круге.",
        visitTime = "Круглосуточно",
        isVisited = true,
        imageUrl = "https://avatars.mds.yandex.net/i?id=4a9b2b0bdd9f87ad1aea319220a227731eac6427-8133404-images-thumbs&n=13",
        queryPrompt = "Что интересного в Салехарде?"
    ),

    MapMarker_DATA(
        id = 32,
        name = "Музей Шемановского",
        type = "Музей",
        lon = 66.5533,
        lat = 66.5371,
        description = "Музей Ямала с коллекцией артефактов и этнографических материалов.",
        visitTime = "10:00 - 18:00",
        isVisited = false,
        imageUrl = "https://live.staticflickr.com/8756/28543812075_62ea8b9db6_b.jpg",
        queryPrompt = "Какие выставки есть в музее Шемановского?"
    ),

    MapMarker_DATA(
        id = 33,
        name = "Полярное сияние в Ямале",
        type = "Природное явление",
        lon = 68.0000,
        lat = 67.0000,
        description = "Популярный регион для наблюдения за северным сиянием.",
        visitTime = "Зависит от сезона",
        isVisited = false,
        imageUrl = "https://avatars.mds.yandex.net/i?id=999e2c604a38b2bbba5c5149e1ab62ca6f659807-12482641-images-thumbs&n=13",
        queryPrompt = "Где лучше наблюдать полярное сияние на Ямале?"
    ),

    MapMarker_DATA(
        id = 35,
        name = "Губкинский ледник",
        type = "Природный объект",
        lon = 67.0000,
        lat = 68.0000,
        description = "Крупный арктический ледник в Ямало-Ненецком округе.",
        visitTime = "Круглосуточно",
        isVisited = false,
        imageUrl = "https://avatars.mds.yandex.net/i?id=2c6e1f4688e39b959ddf668602738866_l-5336145-images-thumbs&n=13",
        queryPrompt = "Как попасть к Губкинскому леднику?"
    ),
    // Чукотский автономный округ
    MapMarker_DATA(
        id = 36,
        name = "Провиденский район",
        type = "Природный объект",
        lon = 173.2385,
        lat = 64.4224,
        description = "Регион с уникальной природой и богатым культурным наследием коренных народов.",
        visitTime = "Круглосуточно",
        isVisited = false,
        imageUrl = "https://avatars.mds.yandex.net/i?id=43138b7cb1ff326b677be4fc6bb85167_l-4614031-images-thumbs&n=13",
        queryPrompt = "Какие достопримечательности есть в Провиденском районе?"
    ),

    MapMarker_DATA(
        id = 37,
        name = "Бухта Лаврентия",
        type = "Природный объект",
        lon = 171.0238,
        lat = 65.5833,
        description = "Живописная бухта, важная для местной экосистемы.",
        visitTime = "Круглосуточно",
        isVisited = false,
        imageUrl = "https://getinrussia.ru/media/4f/e1/10.jpg",
        queryPrompt = "Как добраться до бухты Лаврентия?"
    ),

    MapMarker_DATA(
        id = 38,
        name = "Национальный парк 'Берингия'",
        type = "Национальный парк",
        lon = 172.0000,
        lat = 65.0000,
        description = "Крупный парк с арктической флорой, фауной и культурными памятниками.",
        visitTime = "Круглосуточно",
        isVisited = false,
        imageUrl = "https://static.tildacdn.com/tild3433-3536-4561-b434-613038336664/IMG_4684_1.jpg",
        queryPrompt = "Что посмотреть в парке 'Берингия'?"
    ),

    MapMarker_DATA(
        id = 39,
        name = "Поселок Уэлен",
        type = "Поселок",
        lon = 169.8123,
        lat = 66.1500,
        description = "Крайняя восточная точка России, известная своей культурой и искусством.",
        visitTime = "Круглосуточно",
        isVisited = false,
        imageUrl = "https://avatars.mds.yandex.net/i?id=a0f08a5619015a6429fdec6e1a38665a_l-7213677-images-thumbs&n=13",
        queryPrompt = "Что интересного в поселке Уэлен?"
    ),

    MapMarker_DATA(
        id = 40,
        name = "Мыс Дежнева",
        type = "Природный объект",
        lon = 169.6444,
        lat = 66.0758,
        description = "Крайняя восточная точка Евразии, популярная среди путешественников.",
        visitTime = "Круглосуточно",
        isVisited = false,
        imageUrl = "https://avatars.mds.yandex.net/i?id=eedbdd2b859cd5e8d729992f5b227c8b_l-5176811-images-thumbs&n=13",
        queryPrompt = "Как доехать до мыса Дежнева?"
    ),

    MapMarker_DATA(
        id = 41,
        name = "Анадырь",
        type = "Город",
        lon = 177.5091,
        lat = 64.7314,
        description = "Столица Чукотки, известная своей современной инфраструктурой и природой.",
        visitTime = "Круглосуточно",
        isVisited = true,
        imageUrl = "https://avatars.mds.yandex.net/i?id=731d9c8f41b10401637ffed5a44aee83_l-9842828-images-thumbs&n=13",
        queryPrompt = "Что посмотреть в Анадыре?"
    ),

    MapMarker_DATA(
        id = 42,
        name = "Мыс Шмидта",
        type = "Природный объект",
        lon = 179.5183,
        lat = 68.9500,
        description = "Арктическая станция и важная точка наблюдения за северной природой.",
        visitTime = "Круглосуточно",
        isVisited = false,
        imageUrl = "https://example.com/mys_shmidta.jpg",
        queryPrompt = "Что интересного на мысе Шмидта?"
    ),

    MapMarker_DATA(
        id = 43,
        name = "Озеро Эльгыгытгын",
        type = "Природный объект",
        lon = 172.1000,
        lat = 67.4994,
        description = "Кратерное озеро, сформированное миллионы лет назад.",
        visitTime = "Круглосуточно",
        isVisited = false,
        imageUrl = "https://avatars.mds.yandex.net/i?id=3a5ff73ed86630188ee317665ac556ee_l-5910334-images-thumbs&n=13",
        queryPrompt = "Как доехать до озера Эльгыгытгын?"
    ),

    MapMarker_DATA(
        id = 44,
        name = "Эгвекинот",
        type = "Поселок",
        lon = 179.2333,
        lat = 65.7278,
        description = "Поселок с музеем коренных народов и потрясающими видами на природу.",
        visitTime = "Круглосуточно",
        isVisited = false,
        imageUrl = "https://avatars.mds.yandex.net/i?id=1b5221b9cbc89f800c3212d34b2cb64d_l-9460281-images-thumbs&n=13",
        queryPrompt = "Какие достопримечательности есть в Эгвекиноте?"
    ),

    MapMarker_DATA(
        id = 45,
        name = "Морской порт Певек",
        type = "Порт",
        lon = 170.3000,
        lat = 69.7000,
        description = "Самый северный морской порт России.",
        visitTime = "Круглосуточно",
        isVisited = false,
        imageUrl = "https://avatars.dzeninfra.ru/get-zen_doc/1931664/pub_5d7ff714e6e8ef00ad02bbd5_5d804c90d4f07a00ae7f510b/scale_1200",
        queryPrompt = "Как попасть в порт Певек?"
    ),

    MapMarker_DATA(
        id = 46,
        name = "Поселок Лорино",
        type = "Поселок",
        lon = 172.9925,
        lat = 65.5019,
        description = "Известен традиционным китобойным промыслом и культурой коренных народов.",
        visitTime = "Круглосуточно",
        isVisited = false,
        imageUrl = "https://avatars.dzeninfra.ru/get-zen_doc/1711766/pub_5d9e96185eb26800b1d28eec_5d9e963886c4a900b246e587/scale_1200",
        queryPrompt = "Что интересного в поселке Лорино?"
    ),

            MapMarker_DATA(
            id = 47,
    name = "Мысы Креста",
    type = "Природный объект",
    lon = 179.3467,
    lat = 66.2422,
    description = "Место, богатое историей и природной красотой, популярное среди туристов.",
    visitTime = "Круглосуточно",
    isVisited = false,
    imageUrl = "https://s9.travelask.ru/system/images/files/001/499/163/wysiwyg_jpg/derevyannyj-krest.jpg?1635926674",
    queryPrompt = "Как добраться до мысов Креста?"
),

MapMarker_DATA(
id = 48,
name = "Поселок Рыркайпий",
type = "Поселок",
lon = 172.6500,
lat = 67.7714,
description = "Поселок известен традиционными промыслами и уникальной культурой коренных народов.",
visitTime = "Круглосуточно",
isVisited = false,
imageUrl = "https://cdint-egvekinot.ru/media/resized/pGHs1bnpF6lATxqDeb2TzITBgKOzINjb0rhYVJGB0To/rs:fit:1024:768/aHR0cHM6Ly9jZGlu/dC1lZ3Zla2lub3Qu/cnUvbWVkaWEvcHJv/amVjdF9zbWkzXzcz/OC9jNy83Yy8zMC9j/Zi84Yi9kOC9maWxh/dG92YS1vbGdhLWt5/aW15aXRlZ2luYS12/YWxlcml5YXR5aW5h/cmFuYXYtcmF5YS10/eWlsdmFsLWFubmEu/anBn.jpg",
queryPrompt = "Какие достопримечательности есть в поселке Рыркайпий?"
),

MapMarker_DATA(
id = 49,
name = "Бухта Мечигмен",
type = "Природный объект",
lon = 172.4850,
lat = 64.8723,
description = "Красивый залив с дикой природой и богатой фауной.",
visitTime = "Круглосуточно",
isVisited = false,
imageUrl = "https://s12.stc.all.kpcdn.net/russia/wp-content/uploads/2023/11/vershiny-gor-natspark-Beringiya-na-CHukotke.jpg",
queryPrompt = "Как попасть в бухту Мечигмен?"
),

MapMarker_DATA(
id = 50,
name = "Чаунская губа",
type = "Природный объект",
lon = 170.2200,
lat = 69.3000,
description = "Большой залив с уникальной экосистемой, популярный среди орнитологов.",
visitTime = "Круглосуточно",
isVisited = false,
imageUrl = "https://avatars.mds.yandex.net/i?id=b8042e22ec68bc1cb48cdfe027245adc_l-5247763-images-thumbs&n=13",
queryPrompt = "Какие виды птиц можно увидеть в Чаунской губе?"
),

MapMarker_DATA(
id = 51,
name = "Мыс Нешкан",
type = "Природный объект",
lon = 171.9234,
lat = 68.3667,
description = "Отдаленное место с видами на Арктику, популярное среди любителей экстремальных путешествий.",
visitTime = "Круглосуточно",
isVisited = false,
imageUrl = "https://www.ts-panel.ru/upload/resize_cache/iblock/0d4/1280_1024_0/Gorodok-na-CHukotke-_1_.jpg",
queryPrompt = "Что можно увидеть на мысе Нешкан?"
),

MapMarker_DATA(
id = 52,
name = "Поселок Инчоун",
type = "Поселок",
lon = 172.9200,
lat = 66.2500,
description = "Маленький поселок с интересной культурой и традиционными занятиями.",
visitTime = "Круглосуточно",
isVisited = false,
imageUrl = "https://school-inchoun.ru/wp-content/uploads/2019/12/inchoun.jpg",
queryPrompt = "Какие традиции сохранились в поселке Инчоун?"
),

MapMarker_DATA(
id = 53,
name = "Залив Карскин",
type = "Природный объект",
lon = 173.0842,
lat = 65.1167,
description = "Живописный залив, популярный среди любителей дикой природы.",
visitTime = "Круглосуточно",
isVisited = false,
imageUrl = "https://happylove.top/uploads/posts/2023-05/1683452321_happylove-top-p-karskoe-more-krasivo-30.jpg",
queryPrompt = "Какая фауна обитает в заливе Карскин?"
),

MapMarker_DATA(
id = 54,
name = "Бухта Пенжина",
type = "Природный объект",
lon = 166.2567,
lat = 62.7167,
description = "Большая бухта с впечатляющими видами на природу и богатой историей.",
visitTime = "Круглосуточно",
isVisited = false,
imageUrl = "https://avatars.mds.yandex.net/i?id=06c27f2bf980fed89c175cd32d18307059bc5b3f-7909006-images-thumbs&ref=rim&n=33&w=300&h=200",
queryPrompt = "Какая история связана с бухтой Пенжина?"
),

// Республика Коми
MapMarker_DATA(
id = 55,
name = "Плато Маньпупунёр",
type = "Природный объект",
lon = 59.3000,
lat = 62.2500,
description = "Одно из семи чудес России, известное каменными столбами.",
visitTime = "Круглосуточно",
isVisited = false,
imageUrl = "https://cdn.culture.ru/images/32877346-0c1a-5d0d-ba15-02f82a298c9b",
queryPrompt = "Как добраться до плато Маньпупунёр?"
),

MapMarker_DATA(
id = 56,
name = "Национальный парк 'Югыд Ва'",
type = "Национальный парк",
lon = 59.0000,
lat = 62.6667,
description = "Самый большой национальный парк России с нетронутой природой.",
visitTime = "Круглосуточно",
isVisited = false,
imageUrl = "https://avatars.mds.yandex.net/i?id=780a1e0ac5ef0dfbb819a80784b5660bc09674822877a399-12590692-images-thumbs&n=13",
queryPrompt = "Что можно увидеть в парке 'Югыд Ва'?"
),

MapMarker_DATA(
id = 57,
name = "Город Сыктывкар",
type = "Город",
lon = 50.8192,
lat = 61.6687,
description = "Столица Коми, известная своей историей и культурой.",
visitTime = "Круглосуточно",
isVisited = true,
imageUrl = "https://avatars.mds.yandex.net/i?id=b6a7bd9d9069c6f55040c4f24bc13ca2_l-12518569-images-thumbs&n=13",
queryPrompt = "Что посмотреть в Сыктывкаре?"
),

MapMarker_DATA(
id = 58,
name = "Троицко-Печорский район",
type = "Природный объект",
lon = 56.2000,
lat = 62.5000,
description = "Регион с богатой природой, включая часть Уральских гор.",
visitTime = "Круглосуточно",
isVisited = false,
imageUrl = "https://i.ytimg.com/vi/xNmt0hY7bls/maxresdefault.jpg",
queryPrompt = "Какие природные маршруты есть в Троицко-Печорском районе?"
),

MapMarker_DATA(
id = 59,
name = "Печора",
type = "Город",
lon = 57.2142,
lat = 65.1470,
description = "Город на севере Коми, известный своей транспортной ролью и природой.",
visitTime = "Круглосуточно",
isVisited = false,
imageUrl = "https://avatars.mds.yandex.net/i?id=98dc7a5dcc487ce5c499914e314731d8_l-4591219-images-thumbs&n=13",
queryPrompt = "Что посмотреть в городе Печора?"
),

MapMarker_DATA(
id = 60,
name = "Интинский край",
type = "Регион",
lon = 60.1533,
lat = 66.0415,
description = "Регион на севере Коми, подходящий для арктических экспедиций.",
visitTime = "Круглосуточно",
isVisited = false,
imageUrl = "https://avatars.mds.yandex.net/i?id=7325c2f0239ef15dcf3762098d0a248c_l-11932091-images-thumbs&n=13",
queryPrompt = "Что интересного в Интинском крае?"
),

MapMarker_DATA(
id = 61,
name = "Северная тайга Коми",
type = "Природный объект",
lon = 53.8333,
lat = 63.8333,
description = "Огромные лесные массивы, входящие в список ЮНЕСКО.",
visitTime = "Круглосуточно",
isVisited = false,
imageUrl = "https://avatars.mds.yandex.net/i?id=5b0d6f5e5b6cd8b28841eb0c66613096_l-5280837-images-thumbs&n=13",
queryPrompt = "Где начать поход по северной тайге Коми?"
),

MapMarker_DATA(
id = 62,
name = "Гора Народная",
type = "Гора",
lon = 60.0000,
lat = 65.0333,
description = "Самая высокая точка Уральских гор, популярная среди альпинистов.",
visitTime = "Круглосуточно",
isVisited = false,
imageUrl = "https://avatars.mds.yandex.net/i?id=e1005fd81e33c52a165ceda4a5624b3e_l-5236362-images-thumbs&n=13",
queryPrompt = "Как покорить гору Народная?"
),

MapMarker_DATA(
id = 63,
name = "Сосногорский парк",
type = "Парк",
lon = 53.8777,
lat = 63.6043,
description = "Популярное место для отдыха и прогулок.",
visitTime = "08:00 - 22:00",
isVisited = false,
imageUrl = "https://avatars.mds.yandex.net/i?id=ea1e042371c7e0d2892202534313bb41_l-10026303-images-thumbs&n=13",
queryPrompt = "Что интересного в Сосногорском парке?"
),

MapMarker_DATA(
id = 64,
name = "Вуктыльский район",
type = "Природный объект",
lon = 57.3167,
lat = 62.3167,
description = "Регион с красивыми видами на Урал и уникальной природой.",
visitTime = "Круглосуточно",
isVisited = false,
imageUrl = "https://i.ytimg.com/vi/LEYBmptE-cM/maxresdefault.jpg",
queryPrompt = "Какие маршруты есть в Вуктыльском районе?"
),

MapMarker_DATA(
id = 65,
name = "Ухта",
type = "Город",
lon = 53.6833,
lat = 63.5667,
description = "Важный промышленный и культурный центр Коми, известный своей историей нефтедобычи.",
visitTime = "Круглосуточно",
isVisited = false,
imageUrl = "https://www.timan-ukhta.ru/images/Ukhta/Ukhta-020.jpg",
queryPrompt = "Что посмотреть в Ухте?"
),

MapMarker_DATA(
id = 66,
name = "Воркута",
type = "Город",
lon = 64.0131,
lat = 67.4977,
description = "Город за Полярным кругом, известный своей историей угольной промышленности.",
visitTime = "Круглосуточно",
isVisited = false,
imageUrl = "https://avatars.mds.yandex.net/i?id=33b8934262f86d881782a00e9d55f097_l-9181674-images-thumbs&n=13",
queryPrompt = "Какие интересные места есть в Воркуте?"
),

MapMarker_DATA(
id = 67,
name = "Печоро-Илычский заповедник",
type = "Заповедник",
lon = 57.0833,
lat = 62.9500,
description = "Один из старейших заповедников России с уникальными природными ландшафтами.",
visitTime = "Круглосуточно",
isVisited = false,
imageUrl = "https://avatars.mds.yandex.net/i?id=a21d7d1d3aff62fa8fa8a70d9795f554_l-5573304-images-thumbs&n=13",
queryPrompt = "Что можно увидеть в Печоро-Илычском заповеднике?"
)
,
MapMarker_DATA(
id = 68,
name = "Инта",
type = "Город",
lon = 60.1300,
lat = 66.0300,
description = "Город, исторически связанный с угольной промышленностью и суровой природой северной Коми.",
visitTime = "Круглосуточно",
isVisited = false,
imageUrl = "https://a.d-cd.net/d119c6es-1920.jpg",
queryPrompt = "Что интересного в городе Инта?"
),

MapMarker_DATA(
id = 69,
name = "Вуктыл",
type = "Город",
lon = 57.3073,
lat = 63.8560,
description = "Небольшой город, известный своими живописными окрестностями и доступом к Уралу.",
visitTime = "Круглосуточно",
isVisited = false,
imageUrl = "https://vuktyl-r11.gosweb.gosuslugi.ru/netcat_files/5/144/vuktyl.jpg",
queryPrompt = "Какие маршруты есть в районе Вуктыла?"
),


MapMarker_DATA(
id = 71,
name = "Сосногорск",
type = "Город",
lon = 53.8650,
lat = 63.5947,
description = "Небольшой город с интересной историей и культурой.",
visitTime = "Круглосуточно",
isVisited = false,
imageUrl = "https://avatars.mds.yandex.net/i?id=52dcab0fbd8e65a0ed77c974a8acc23d_l-9156405-images-thumbs&n=13g",
queryPrompt = "Что посмотреть в Сосногорске?"
),

MapMarker_DATA(
id = 72,
name = "Природный парк 'Шудья'",
type = "Природный парк",
lon = 57.5000,
lat = 63.0000,
description = "Парк с уникальными природными ландшафтами и маршрутами.",
visitTime = "Круглосуточно",
isVisited = false,
imageUrl = "http://photos.wikimapia.org/p/00/05/11/75/17_full.jpg",
queryPrompt = "Какие маршруты есть в природном парке 'Шудья'?"
),

MapMarker_DATA(
id = 73,
name = "Княжпогостский район",
type = "Район",
lon = 50.9967,
lat = 63.8517,
description = "Регион с богатой природой и историческими памятниками.",
visitTime = "Круглосуточно",
isVisited = false,
imageUrl = "https://komiinform.ru/content/news/images/232869/DSC00122.jpg",
queryPrompt = "Что интересного в Княжпогостском районе?"
),

// Красноярский край (Таймырский полуостров)
MapMarker_DATA(
id = 74,
name = "Заповедник 'Таймырский'",
type = "Заповедник",
lon = 102.0000,
lat = 74.0000,
description = "Один из крупнейших заповедников России, богатый уникальной арктической природой.",
visitTime = "Круглосуточно",
isVisited = false,
imageUrl = "https://avatars.mds.yandex.net/i?id=a6a4b7b17ceeb2aa88d4ef92ad032ddc_l-5226766-images-thumbs&n=13",
queryPrompt = "Как посетить заповедник 'Таймырский'?"
),
MapMarker_DATA(
id = 75,
name = "Поселок Амдерма",
type = "Поселок",
lon = 61.3947,
lat = 69.7631,
description = "Небольшой поселок на побережье Карского моря, известный своей историей и суровыми условиями.",
visitTime = "Круглосуточно",
isVisited = false,
imageUrl = "https://i.pinimg.com/736x/d9/ab/2e/d9ab2efddafb3c2d6e90e5846fb73773.jpg",
queryPrompt = "Что интересного в поселке Амдерма?"
),

MapMarker_DATA(
id = 76,
name = "Мыс Канин Нос",
type = "Природный объект",
lon = 43.273126,
lat = 68.656600,
description = "Мыс, омываемый Баренцевым морем, с потрясающими видами на Арктику.",
visitTime = "Круглосуточно",
isVisited = false,
imageUrl = "https://avatars.mds.yandex.net/i?id=c4be93540594c78afa958a2e1030b381_l-5241338-images-thumbs&n=13",
queryPrompt = "Как добраться до мыса Канин Нос?"
),

MapMarker_DATA(
id = 77,
name = "Озеро Таймыр",
type = "Природный объект",
lon = 102.4000,
lat = 74.6333,
description = "Крупнейшее пресноводное озеро за Полярным кругом.",
visitTime = "Круглосуточно",
isVisited = false,
imageUrl = "https://example.com/taymyr_lake.jpg",
queryPrompt = "Как добраться до озера Таймыр?"
),

MapMarker_DATA(
id = 78,
name = "Дудинка",
type = "Город",
lon = 86.1778,
lat = 69.4058,
description = "Портовый город и административный центр Таймырского района.",
visitTime = "Круглосуточно",
isVisited = true,
imageUrl = "https://avatars.dzeninfra.ru/get-zen_doc/3503969/pub_6448e6c7433e4b2820684a6f_644944bb6fa9cb7ce7d95854/scale_1200",
queryPrompt = "Что посмотреть в городе Дудинка?"
),

MapMarker_DATA(
id = 79,
name = "Норильск",
type = "Город",
lon = 88.2027,
lat = 69.3558,
description = "Город на севере Красноярского края с богатой историей и промышленностью.",
visitTime = "Круглосуточно",
isVisited = true,
imageUrl = "https://avatars.mds.yandex.net/i?id=45ac865cbeb70867ccc52176e9336974_l-4210399-images-thumbs&n=13",
queryPrompt = "Что интересного в Норильске?"
),

MapMarker_DATA(
id = 80,
name = "Мыс Челюскин",
type = "Природный объект",
lon = 104.2500,
lat = 77.7167,
description = "Самая северная точка материка Евразия.",
visitTime = "Круглосуточно",
isVisited = false,
imageUrl = "https://avatars.mds.yandex.net/i?id=88cbfde61a6a16508a3251027ff51c17_l-5239481-images-thumbs&n=13",
queryPrompt = "Как добраться до мыса Челюскин?"
),

MapMarker_DATA(
id = 81,
name = "Острова Северной Земли",
type = "Архипелаг",
lon = 96.0000,
lat = 80.0000,
description = "Арктический архипелаг с ледниками и суровой природой.",
visitTime = "Круглосуточно",
isVisited = false,
imageUrl = "https://i.pinimg.com/736x/f2/c4/2f/f2c42fda61611f8533c643b88026809e.jpg",
queryPrompt = "Какие маршруты доступны на островах Северной Земли?"
),

MapMarker_DATA(
id = 82,
name = "Гора Арага",
type = "Гора",
lon = 102.3333,
lat = 73.9167,
description = "Высокая гора на Таймыре с потрясающими видами.",
visitTime = "Круглосуточно",
isVisited = false,
imageUrl = "https://vsegda-pomnim.com/uploads/posts/2022-04/1650955865_17-vsegda-pomnim-com-p-gora-alagyaz-armeniya-foto-17.jpg",
queryPrompt = "Как покорить гору Арага?"
),

MapMarker_DATA(
id = 83,
name = "Река Пясина",
type = "Река",
lon = 93.7500,
lat = 73.0000,
description = "Крупная арктическая река, протекающая через Таймыр.",
visitTime = "Круглосуточно",
isVisited = false,
imageUrl = "https://www.vesveter.ru/images/rossia/pyasina.jpg",
queryPrompt = "Какие туры есть на реке Пясина?"
),

MapMarker_DATA(
id = 84,
name = "Арктический институт",
type = "Научный объект",
lon = 89.2000,
lat = 69.3000,
description = "Научный центр для изучения арктической природы и климата.",
visitTime = "10:00 - 17:00",
isVisited = false,
imageUrl = "https://i.vuzopedia.ru/storage/app/uploads/public/639/97c/f76/63997cf7652d9242368862.jpg",
queryPrompt = "Какие исследования проводятся в Арктическом институте?"
),


MapMarker_DATA(
id = 86,
name = "Таймырский дом культуры",
type = "Культурный объект",
lon = 86.1778,
lat = 69.4058,
description = "Центр культурной жизни Таймыра, с выставками и мероприятиями.",
visitTime = "09:00 - 18:00",
isVisited = true,
imageUrl = "https://proprostranstva.ru/wp-content/uploads/2021/03/tajmyr2.jpg",
queryPrompt = "Какие мероприятия проходят в Таймырском доме культуры?"
)

)


