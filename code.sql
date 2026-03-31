yele naam = "Akram"
yele umar = 22

bols "Naam: "
bol naam

yele list = [1,2,3]
list += 4
list += 5

bols "Array value:"
bol list[2]

// ok

yele user = { naam: "Akram", umar: 22 }
user.city = "Delhi"

bol user.naam
bol user.city

chala list me i {
    bol "List item:"
    bol i
}

yele nums = [1,2,3]

chala nums me i {
    chala nums me j {
        bols "i:"
        bol i
        bols "j:"
        bol j
    }
}

agar umar > 18 {
    bol "Adult"
} warna {
    bol "Minor"
}

agar user.umar > 18 {
    agar user.city == "Delhi" {
        bol "Adult from Delhi"
    } warna {
        bol "Adult but not from Delhi"
    }
} warna {
    bol "Minor"
}

chala list me i {
    agar i % 2 == 0 {
        bol "Even:"
        bol i
    } warna {
        bol "Odd:"
        bol i
    }
}

kaam jodo(a, b) {
    wapas a + b
}

yele result = jodo(5, 3)
bol result

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
    bol ""
}

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

kaam yeleUser(n, u) {
    wapas { naam: n, umar: u }
}

yele u1 = yeleUser("Akram", 22)

bol u1.naam
bol u1.umar

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