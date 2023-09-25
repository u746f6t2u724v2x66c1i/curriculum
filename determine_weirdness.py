def ltrim(s):
    return s.lstrip()

def rtrim(s):
    return s.rstrip()

def determine_weirdness(N):
    if N % 2 != 0:
        return "Weird"
    else:
        if 2 <= N <= 5:
            return "Not Weird"
        elif 6 <= N <= 20:
            return "Weird"
        else:
            return "Not Weird"

if __name__ == "__main__":
    N_temp = input("Enter a number: ")
    N = int(rtrim(ltrim(N_temp)))

    result = determine_weirdness(N)
    print(result)

