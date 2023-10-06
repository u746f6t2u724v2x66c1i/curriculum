def beer_song():
    for i in range(99, 0, -1):
        print(f"{i} bottles of beer on the wall")
        print(f"{i} bottles of beer")
        print("Take one down, pass it around")
        if i - 1 == 1:
            print("1 bottle of beer on the wall")
        else:
            print(f"{i-1} bottles of beer on the wall")
        print()

    print("No more bottles of beer on the wall")
    print("No more bottles of beer")
    print("Go to the store and buy some more")
    print("99 bottles of beer on the wall")


if __name__ == "__main__":
    beer_song()
