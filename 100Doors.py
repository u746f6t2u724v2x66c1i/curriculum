def toggle(doors, step):
    for i in range(step, len(doors), step):
        doors[i] = not doors[i]

def main():
    doors = [False] * 101  # Array to represent doors (index 0 is unused)

    # Perform 100 passes
    for pass_num in range(1, 101):
        toggle(doors, pass_num)

    # Print the state of the doors
    for i in range(1, 101):
        print(f"Door {i} is {'open' if doors[i] else 'closed'}")

if __name__ == "__main__":
    main()


