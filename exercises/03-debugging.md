# Exercise 11 — The Debugging Gauntlet

Five programs, escalating difficulty. Fix each one, then document it.

For each: what type of error, what the message said (or didn't), and what was actually wrong.

---

## DebugMe1

| | |
|---|---|
| **Error type** (syntax / runtime / logic) | compilation failed |
| **Message Java gave** | ';' expected |
| **What was actually wrong** | missing semicolon |
| **The fix** | added a semicolon |

---

## DebugMe2

| | |
|---|---|---|
| **Error type** | compilation error | compilation failed |
| **Message** | ';' expected | String cannot be converted to int |
| **What was wrong** | missing ';'| number in "" | 
| **The fix** | added ';'| deleted quotaions |

---

## DebugMe3

| | |
|---|---|
| **Error type** | compilation failed |
| **Message** | cannot convert from double to int |
| **What was wrong** | didn't round properly |
| **The fix** | used Math.Round |

---

## DebugMe4

| | |
|---|---|
| **Error type** | compilation failed |
| **Message** | cannot find symbol |
| **What was wrong** | two variables didn't have the right capitalization |
| **The fix** | fixed the capitalization of both variables |

---

## DebugMe5

> ⚠️ This one **compiles and runs**. It just gives the wrong answer.

| | |
|---|---|
| **Error type** | It doesn't say but I'm guessing a syntax error or compiler failure |
| **What output did you expect?** | not the right one |
| **What output did you get?** | 0.0% |
| **What was actually wrong** | int division trap |
| **The fix** | added (double) after variable name and it printed 86.0% |
| **How did you find it?** | I found that the variable types did not match up |

---

## Reflection

**1. Which was hardest? Why?**

The third one because I had to add the Math.Round function and declare it as an int so that it would print correctly. That's how I knew to add the double declaration in DebugMe5.java

**2. DebugMe5 had no error message at all. What strategy did you use to find the problem?**

I read the code and looked for variable declaration errors because the numbers seemed ok, so the problem had to be there.

**3. Why is a logic error more dangerous in real software than a syntax error?**

Maybe because logic errors don't return on a terminal as an error and syntax errors do, so you know how to edit and how to fix thoe, but logic errors you only find if you look over your code well. 
