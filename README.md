# calendar
Current month calendar
Возникли небольшие трудности со всеми пунктами задания
В java.time не нашел функции для определения текущего месяца отдельно, есть только месяц и год, месяц и дата...Так же
там трудности с определением высокостного года, нужно было бы делать вручную или я не додумался как при помощи тех 
функций что имется это сделать
Использовалась java.util.calendar вместо этого но пару функций из java.time я взял, так же разобрался как переводить через 
time.chrono и time.format но в задании не использовал
По поводу закрашивания в консоли без подключения сторонних библиотек нашел только 2 варианта 
которые внутри массива работают не совсем корректно, закрашивают всю строку или все элементы строки от начала до символа
по этому внутри просто поставил метку где текущий день и закрасил не все столбики выходных, 
а лишь их шапки которые прописывались вне массива. Желательно бы получить совет как правильно закрашивать именно выбраный элемент массива так
как в основном предлагают либо делать так как сделал я либо подключать Jansi библиотеку которую во первых затруднительно было
найти на каком то официальном источнике а та какую я попробовал-подключилась но не давала никакого эффекта.

