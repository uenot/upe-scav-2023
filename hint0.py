import random

def foo(a, b):
    bar = 2
    for i in range(min(len(a), len(b))):
        if a[i] == b[i]:
            bar -= 1
        if bar <= 0:
            return random.choice([a[i], b[i]])
    return a[0]
        
def mystery(x):
    y = x.swapcase().split()
    return foo(y[0], y[-1])

def main():
    print(mystery("Upsilon Pi Epsilon"))

if __name__ == "__main__":
    main()