// ===============================
// 1. VARIABLES (Basic Data Types)
// ===============================

yele naam = "Akram"     // string variable
yele umar = 22          // number variable

bols "Naam: "           // print without newline
bol naam                // print variable


// ===============================
// 2. ARRAY (LIST) OPERATIONS
// ===============================

yele list = [1,2,3]     // array create

list += 4               // append element
list += 5

bols "Array value:"
bol list[2]             // index access (0-based)


// ===============================
// 3. OBJECT (MAP / DICTIONARY)
// ===============================

yele user = { naam: "Akram", umar: 22 }

user.city = "Delhi"     // dynamic property add

bol user.naam
bol user.city


// ===============================
// 4. LOOP (FOR-EACH STYLE)
// ===============================

chala list me i {       // loop through list
    bol "List item:"
    bol i
}


// ===============================
// 5. NESTED LOOP
// ===============================

yele nums = [1,2,3]

chala nums me i {
    chala nums me j {
        bols "i:"
        bol i
        bols "j:"
        bol j
    }
}


// ===============================
// 6. IF-ELSE CONDITION
// ===============================

agar umar > 18 {
    bol "Adult"
} warna {
    bol "Minor"
}


// ===============================
// 7. NESTED CONDITIONS (OBJECT)
// ===============================

agar user.umar > 18 {
    agar user.city == "Delhi" {
        bol "Adult from Delhi"
    } warna {
        bol "Adult but not from Delhi"
    }
} warna {
    bol "Minor"
}


// ===============================
// 8. LOOP + CONDITION (EVEN/ODD)
// ===============================

chala list me i {
    agar i % 2 == 0 {
        bol "Even:"
        bol i
    } warna {
        bol "Odd:"
        bol i
    }
}


// ===============================
// 9. FUNCTION (BASIC)
// ===============================

kaam jodo(a, b) {
    wapas a + b         // return sum
}

yele result = jodo(5, 3)
bol result


// ===============================
// 10. FUNCTION + CONDITION
// ===============================

kaam check(n) {
    agar n % 2 == 0 {
        wapas "even"
    } warna {
        wapas "odd"
    }
}

chala list me i {
    bol check(i)
}


// ===============================
// 11. ARRAY OF OBJECTS
// ===============================

yele users = [
    { naam: "A", umar: 17 },
    { naam: "B", umar: 25 },
    { naam: "C", umar: 30 }
]

chala users me u {
    agar u.umar > 18 {
        bol u.naam + " adult hai"
    } warna {
        bol u.naam + " minor hai"
    }
}


// ===============================
// 12. 2D ARRAY (MATRIX)
// ===============================

yele matrix = [
    [1,2],
    [3,4],
    [5,6]
]

chala matrix me row {
    chala row me val {
        bols val
        bols " "
    }
    bol ""              // new line
}


// ===============================
// 13. NESTED OBJECT
// ===============================

yele student = {
    naam: "Akram",
    marks: {
        math: 90,
        sci: 80
    }
}

agar student.marks.math > 85 {
    bol "Math strong hai"
}


// ===============================
// 14. FUNCTION RETURN OBJECT
// ===============================

kaam yeleUser(n, u) {
    wapas { naam: n, umar: u }
}

yele u1 = yeleUser("Akram", 22)

bol u1.naam
bol u1.umar


// ===============================
// 15. COMPLEX FUNCTION (NESTED LOGIC)
// ===============================

kaam checkUser(u) {
    agar u.umar > 18 {
        agar u.umar > 21 {
            wapas "Pro Adult"
        } warna {
            wapas "Adult"
        }
    } warna {
        wapas "Minor"
    }
}

chala users me u {
    bol u.naam + ": " + checkUser(u)
}