all_place = ["札幌","東京","横浜","大阪","名古屋","福岡"]
wait_place = ["札幌","大阪"]
get_place = ["横浜"]

for place in all_place:
    #ここから記述（ヒント：in演算子を用いて、条件分岐）
    if place in get_place:
        print("{}のチケットが当選しました！".format("横浜と札幌と大阪"))

