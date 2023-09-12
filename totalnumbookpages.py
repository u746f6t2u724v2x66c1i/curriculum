total_shelves = int(input())
total_queries = int(input())

total_num_books = [0] * total_shelves
total_num_pages = [[0] * 1100 for _ in range(total_shelves)]

for _ in range(total_queries):
    query = input().split()
    query_type = int(query[0])

    if query_type == 1:
        x = int(query[1])
        y = int(query[2])

        total_num_pages[x][total_num_books[x]] = y
        total_num_books[x] += 1
    elif query_type == 2:
        x = int(query[1])
        y = int(query[2])

        print(total_num_pages[x][y])
    elif query_type == 3:
        x = int(query[1])

        print(total_num_books[x])

