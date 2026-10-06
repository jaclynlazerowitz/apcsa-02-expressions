# Exercise 4 — Predict, Then Run

**Fill in the PREDICTED column completely before you run any code.** That's the whole exercise. Checking the answer without committing to a guess teaches you nothing.

| # | Expression | Predicted | Actual | Right? | If wrong, why? |
|---|---|---|---|---|---|
| 1 | `9 / 2` | 4 | 4 | Yes | |
| 2 | `9 % 2` | 1 | 1 | Yes | |
| 3 | `9.0 / 2` | 4.5 | 4.5 | Yes | |
| 4 | `9 / 2.0` | 4.5 | 4.5 | Yes | |
| 5 | `2 + 3 * 4` | 14 | 14 | Yes | |
| 6 | `(2 + 3) * 4` | 20 | 20 | Yes | |
| 7 | `20 - 5 - 3` | 12 | 12 | Yes | |
| 8 | `17 % 5` | 2 | 2 | Yes | |
| 9 | `5 % 17` | 0 | 5 | No | 17 doesn't fit into 5 once, so the remainder is just 5 |
| 10 | `100 / 3 / 3` | 11 | 11 | Yes | |
| 11 | `1 / 2 * 100` | 50 | 0 | No | Integer division gives 0 because 1/2 = 0.5, and the decimal gets chopped off, so since 0 * 100 = 0, the answer would be 0|
| 12 | `100 * 1 / 2` | 50 | 50 | Yes | |

---

## Follow-up

**1. Compare #11 and #12. Same numbers, same operators, completely different answers. Explain why.**

In 11, what first happens is 1/2 = 0.5 which becomes 0, them it gets multiplied by 100, so that is 0. In 12, 100 gets multiplied by 1 first and then divided by 2, which is 50. The order of operations changes the output because the int function specifically changes the decimal.

**2. #9 gives `5`. Explain why `5 % 17` is 5 and not 0.**

5 % 17 is asking how many times 17 can go into 5, so basically it's asking 5/17 and asking for the remainder. 17 doesn't go into 5 at all because 17>5, so the remainder is the number that's left after the operation, which is 5 since the operation cannot run.

**3. A classmate writes this to calculate a percentage:**
```java
int correct = 7;
int total = 10;
double percent = correct / total * 100;
```
**They get `0.0`. Explain what went wrong and write the corrected line.**

They get 0.0 because when they do 7/10 which are both int values, they give a decimal which gets chopped off so 7/10 here = 0. 0 gets multiplied by 100, so the double that gets outputted is 0.0.

```java
    double correct = 7;
    double total = 10;
    double percent = correct/total * 100;
```

**4. Give one real situation where `%` would genuinely be useful. Not from this worksheet — something from your own life or your project idea.**

Maybe to figure out if a number is an even or an odd. You would do the number % 2, and if the function returns a 1 it's an odd number, and if it returns 0, it's even. 
