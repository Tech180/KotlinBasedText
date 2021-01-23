import java.util.*

private var failed = false
private var name = Scanner(System.`in`)
//private var realName = name.nextLine()
private var k = 0

fun main() {

    //var name = Scanner(System.`in`)

    println("Please enter your name: ")

    var realName = name.nextLine()

    val list = mutableListOf("Lauren", "Alex", "Garrett", "Riley")

    //list[3].equals("RILEY",ignoreCase = true)

    //val filt = list.filter {it[0] == 'R'}
    //println("Riley -> $filt")

    var count = 1

    var v = 0
    var a = 0
    var c = 0

    var game: Boolean = true

    while (game) {
        loop@ while (realName != list[3] && realName != "exit") {

            if (count == 1) {
                count++
                println("What... That's not your name! Stop lieing!")
                println("What's your real name?")
                realName = name.nextLine()

            } else if (count == 2) {
                count++
                println("Haha... very funny. But actually what's your name?")
                realName = name.nextLine()

            } else if (count == 3) {
                count++
                println("Ok enough with the games! I'm being quite serious")
                realName = name.nextLine()
            } else if (count >= 3) {

                println(
                    "Ok! That's it you need to stop lieing so much and pull" +
                            " yourself together!"
                )

                Thread.sleep(1_000)

                println()

                println(
                    "Ok ok... I just need to calm down and relax. I'll tell you what..." +
                            " I'll give you a list this time and if this doesn't help then I don't" +
                            " know what I'll do."
                )

                Thread.sleep(5_000)

                println("Ok... ummmm where did I put that darn thing...")
                Thread.sleep(2_000)
                println()
                println("I know I put it somewhere...")
                Thread.sleep(5_000)
                println()
                println("Ahhh! Here it is...")
                println("Here's the lame list...")

                println()

                println(list)

                println()

                println("Now choose CORRECTLY this time!!!")

                var answer = name.nextLine()

                if (answer != "Riley") {
                    println("ok... ummm for one you're dumb and why are you being so difficult? ")
                    println()
                    println("I'm pretty much out of ideas...")
                    println()
                    println("that's right you have defeated me")
                    println()
                    Thread.sleep(3_000)
                    println("well actually... we could always try picking a number. Ya! Let's do that!")

                    val random = (0..10).random()

                    println("Give me a sec... I have to think of a number...")

                    println()

                    Thread.sleep(10_000)

                    println("Ok... ok I think I got one!")

                    println()

                    println(
                        "If you get this correct I will just tell you the name orrrrrrrr I'll change the name to that" +
                                " name at the end"
                    )

                    println()

                    println("You ready?")

                    Thread.sleep(2_000)

                    println()

                    println("Pick a number between 0 and 10")

                    println("I'll give you three tries...")

                    var anumber = 0

                    var sc = Scanner(System.`in`)

                    while (v != 1) {

                        if (a == 0) {
                            println("And you're first guess is...")
                            while (!sc.hasNextInt()) {
                                k++
                                if (k == 1) {
                                    println("uh... that's not a number. Please actually try this time")
                                } else if (k == 2) {
                                    println("didn't I just say to put in a number? You should listen")
                                } else if (k == 3) {
                                    println("please... please listen to me. PUT IN A NUMBER! Can you understand me")
                                } else if (k >= 4) {
                                    println("ok i'm just going to say the same thing over and over again until you get this right...")
                                }
                                sc.next()
                            }
                            anumber = sc.nextInt()
                            a++
                        } else if (a == 1) {
                            println("And you're second guess is...")
                            while (!sc.hasNextInt()) {
                                k++
                                if (k == 1) {
                                    println("uh... that's not a number. Please actually try this time")
                                } else if (k == 2) {
                                    println("didn't I just say to put in a number? You should listen")
                                } else if (k == 3) {
                                    println("please... please listen to me. PUT IN A NUMBER! Can you understand me")
                                } else if (k >= 4) {
                                    println("ok i'm just going to say the same thing over and over again until you get this right...")
                                }
                                sc.next()
                            }
                            anumber = sc.nextInt()
                            a++
                        } else if (a == 2) {
                            println("And you're third guess is... plz get this right...")
                            while (!sc.hasNextInt()) {
                                k++
                                if (k == 1) {
                                    println("uh... that's not a number. Please actually try this time")
                                } else if (k == 2) {
                                    println("didn't I just say to put in a number? You should listen")
                                } else if (k == 3) {
                                    println("please... please listen to me. PUT IN A NUMBER! Can you understand me")
                                } else if (k >= 4) {
                                    println("ok i'm just going to say the same thing over and over again until you get this right...")
                                }
                                sc.next()
                            }
                            anumber = sc.nextInt()
                            a++
                        }


                        if (anumber != random) {
                            when (c) {
                                0 -> println("Wrong... Try Again")
                                1 -> println("Really... That's your answer?")
                                2 -> println("ummm... wow... just wow")
                                else -> {
                                    println("well... you failed... again")
                                    println()
                                    println("yep... you truly are something else")
                                    failed = true
                                    v = 1
                                    break@loop
                                }
                            }

                            c++

                        } else if (anumber == random) {
                            if (k == 0 && c == 0) {
                                println(
                                    "Whoa... maybe I was wrong about you! First guess and you got it!" +
                                            " Danggggggggg!"
                                )
                                println()
                                Thread.sleep(4_000)
                                println("Well... I'll keep my end of the bargain and I'll change the name for you...")
                                println()
                                Thread.sleep(3_000)
                                println("So! What is you 'actual' name?")

                                list.set(3, name.nextLine())
                                break@loop
                            }

                            if (k == 0 && (c == 1 || c == 2)) {
                                println("Woooooo you got it (even though it took an attempt or two)")
                                println()
                                Thread.sleep(4_000)
                                println("A promise is a promise...")
                                println()
                                Thread.sleep(3_000)
                                println("So pal! What's your name?")

                                list.set(3, name.nextLine())
                                break@loop
                            }

                            if (k == 1 && (c == 0 || c == 1 || c == 2)) {
                                println("Hey you got it! I'll chalk up that first mistake with the letters as an error lol")

                                Thread.sleep(3_000)
                                println()

                                println("Ok ok what's your realllllll name?")

                                list.set(3, name.nextLine())
                                break@loop
                            }

                            if (k == 2 && (c == 0 || c == 1 || c == 2)) {
                                if (c == 0) {
                                    println("what was the point of making me say those things if you guess it correctly (technically) the first time?")
                                    println()
                                    Thread.sleep(3_000)
                                    println("Nonetheless... I kept my promise.")
                                    println()
                                    Thread.sleep(1_000)
                                    println("Name?")

                                    list.set(3, name.nextLine())
                                    break@loop

                                } else if (c == 1) {
                                    println("well at least you got it correct after messing with me twice")
                                    println()
                                    Thread.sleep(2_000)
                                    println("Ok... what's your real name then?")

                                    list.set(3, name.nextLine())
                                    break@loop
                                } else if (c == 2) {
                                    println("finally... you're a terrible guesser btw")
                                    println()
                                    Thread.sleep(2_000)
                                    println("uggg... what's your name?")

                                    list.set(3, name.nextLine())
                                    break@loop
                                }


                            }

                            if (k == 3 && (c == 0 || c == 1 || c == 2)) {
                                if (c == 0 || c == 1) {
                                    println("You know... its not very nice to make me yell at you like that")
                                    println()
                                    Thread.sleep(2_000)
                                    println("so rude person... you gotta a name then")
                                    println()

                                    list.set(3, name.nextLine())
                                    break@loop
                                }
                                if (c == 2) {
                                    println("Why do you make things so difficult")
                                    println()
                                    Thread.sleep(2_000)
                                    println("All you had to do was guess the number... oh i guess you did.")
                                    println()
                                    Thread.sleep(3_000)
                                    println("Well you were pretty rude,,, but I'm a nice guy and will still change the name.")
                                    Thread.sleep(2_000)
                                    println()
                                    println("So... What'll the name be?")

                                    list.set(3, name.nextLine())
                                    break@loop
                                }

                            }

                            if (k == 4 && (c == 0 || c == 1 || c == 2)) {

                                if (k >= 4 && c == 2) {

                                    println("You know what... even though you got the answer correct, in doing so you patronized me along the way")
                                    println()
                                    Thread.sleep(2_000)
                                    println("All you had to do was guess the number... and instead you decided to make me do extra work!")
                                    println()
                                    Thread.sleep(3_000)
                                    println("You know people have better things to do than deal with you...")
                                    Thread.sleep(2_000)
                                    println()
                                    println("So instead I'll change it to what I want")
                                    println()

                                    realName = "Jerk"

                                    break@loop
                                }

                                if (c == 0 || c == 1) {
                                    println("You know... its not very nice to make me yell at you like that")
                                    println()
                                    Thread.sleep(2_000)
                                    println("so rude person... you gotta a name then")
                                    println()
                                    println("And another thing!")
                                    println("I work hard everyday to make sure things run smoothly around here and people like you make it soooooooo much harder")
                                    println()
                                    Thread.sleep(3_000)

                                    list.set(3, name.nextLine())
                                    break@loop
                                }

                                if (c == 2) {
                                    println("You're a terrible person.")
                                    println()
                                    Thread.sleep(2_000)
                                    println("All you had to do was guess the number... and instead you decided to make me do extra work!")
                                    println()
                                    Thread.sleep(3_000)
                                    println("You know people have better things to do than deal with you...")
                                    Thread.sleep(2_000)
                                    println()
                                    println("Just give me the name.")
                                    println()

                                    list.set(3, name.nextLine())
                                    break@loop
                                }
                            }
                        }
                    }
                }
                else {
                    realName = "Riley"
                }
                break@loop
            }

        }

        if(realName == "exit"){
            continue
        }
        else {
            failed(realName)
        }


        //This function enables the user to play again... However I'm still struggling to to move outside of main
        //TODO
        fun playAgain() {

            var yup = 0

            while (yup != 1) {
                var rescan = Scanner(System.`in`)

                var again: String

                Thread.sleep(4_000)
                println()
                println("Do you want to play again?")
                println()
                println("Type yes or no")
                println()

                again = rescan.nextLine()

                if (again == "yes" || again == "Yes") {
                    count = 1
                    failed = false

                    v = 0
                    a = 0
                    c = 0
                    k = 0
                    //TODO
                } else if (again == "no" || again == "No") {
                    game = false
                }
                else {
                    continue
                }
            }
        }

        playAgain()

    }

}

fun selectGood() : String {
    println()
    Thread.sleep(3_000)
    println("Random quote of the day: ")
    val randg = mutableListOf(
        "you are an inspiring figure!",
        "You're amazing and beautiful!",
        "Danggggggg, you are looking goooooood today!",
        "Hey, no matter what happens in your life always lift yourself higher than the people around you",
        "Now that's what I'm talking about! You are probably an extremely intelligent person :)"
    ) //random good quote

    return randg[Random().nextInt(randg.size)]

}

fun selectBad() : String {
    println("Random quote of the year: ")
    val randb = mutableListOf(
        "no quote lololol",
        "ummm you are interesting?",
        "wut... Oh a quote... ya you're you ya know",
        "you don't deserve a quote"
    ) //random bad quote

    return randb[Random().nextInt(randb.size)]

}

fun selectEither() {

    val e = mutableListOf("good", "bad")

    val huh = e[Random().nextInt(e.size)]

    if(huh.equals("bad")){
        bad()
    }
    else if(huh.equals("good")){
        good()
    }

}

fun badQuestionMark() {
    println("Hey... I'll be generous this time! Do you want a good or bad quote? " +
            "Press 1 for a good quote or 2 for a bad quote")

    var sc = Scanner(System.`in`)
    var choice = sc.nextInt()

    while(choice != 1 || choice != 2) {
        while (!sc.hasNextInt()) {
            var q = 0

            if (q == 0) {
                println("hey uh... I said a number didn't I? lol")
                sc.next()
            }
            else if(q == 1) {
                println("can you please put in the proper number? I'm not going to ask again...")
                sc.next()
            }
            else{
                var queue = 0

                val random = (0..1).random()

                while(queue != 1) {
                    if (random == 0) {
                        println("alright... whatever... this is what you deserve!")
                        println()
                        choice = 2
                    } else if (random == 1) {
                        println("this is your last chance!!!!!!")
                        sc.next()
                        queue++
                    }
                }
                choice = 2
            }

            if (choice == 1) {
                println("Alright! Good quote it is!")
                good()
            }
            else if (choice == 2) {
                println("Alright... but uh idk why you would want one lol")
                bad()
            }

        }
    }

    if (choice == 1) {
        println("Alright! Good quote it is!")
        println(good())
    }
    else if (choice == 2) {
        println("Alright... but uh idk why you would want one lol")
        println(bad())
    }
    else{
        println("this shouldn't happen lol... fix")
    }
}

fun bad() {
    val bad = selectBad()
    println(bad)
}

fun good() {
    val good = selectGood()
    println(good)
}

fun failed(realName : String) {

    if (failed == true) {
        println()
        println("Well... I officially don't know you anymore so uh... bye")
        println()
        Thread.sleep(4_000)
        println("That's your que to leave... so I'll leave instead")
        bad()
    } else if (failed == false) {
        if (k >= 4) {
            println("You are a $realName and should probably go think about your life decisions")
            bad()
        } else {
            println("yes... $realName is your name!")
            good()
            //badQuestionMark()
        }
    }
}

