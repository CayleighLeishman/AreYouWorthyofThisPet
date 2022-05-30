import java.util.Scanner

fun Main(args: Array<String>) {
    println("Hello There!")

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Welcome to the Quiz!")
    println("This quiz gives you three pet options, a fish, dog or cats.")
    println("once you choose which pet you want you will be asked five True or False questions.")
    println("These are asked to determine if you are worthy of being it's pet owner")
    println("Type 'T' or 'F' in capitals to answer the question")

    //THE STREACH IS THE PET IMAGE. FINISH BASIC AND THEN TRY FOR IMAGE
    //println("If you are you'll meet your new pet. If you fail you may start the quiz again.")
    println("If you get a question wrong, you will have to retake all the questions that were asked. ")

    var done = readLine()
    println("When you are done with the quiz type 'd'  ")

    //have an option where else: that isn't a proper answer, try again and make sure it's capitalized(?)
    //while the user hasn't typed "done" do the quiz
    //this while done is showing as red becuase comp thinks you are reassinging the value. You need to set it as user input
    //or while done != "d" or when "Done" dosent execute. Have a code that shows when "Done" is typed return exit
    while (done != "d"){

        var pet = readLine()
        println("What pet do you want to get? dog/cat/fish ")

        //it has red underlines becuase you forgot to set the questions as user input
        if (pet == "dog"){

            var dog1 = readLine()
            println("True or False: You do not need to walk your dog. T/F")

            if (dog1 == "T"){

                var dog2 = readLine()
                println("Your dog needs more than three meals a day? T/F")

                if (dog2 == "T") {
                    println("No it does not. Unless directed by a veternarian, it should only eat twice a day. Preferbly morning and night.")
                } //dog2 True

                else (dog2 == "F"){
                    println("Correct! ")


                    var dog3 = readLine()
                    println("True or False: All a dog needs is cuddles? t/f ")

                    if (dog3 == "T") {

                        println("While cuddles are important for some dogs, that is not all a dog needs. I have hopes for you though, take the quiz again!")
                    }//end dog3 true

                    else (dog3 == "F"){
                        println(" Correct! Though, cuddles can be great both you and your dog will need space eventually.")
                        var dog4 = readLine()
                        println("You don't need to take the dog out for a walk even if he is small")

                        if (dog4 == "T"){
                            println("That was just a sad answer. Of course you need to take your dog out! Smaller dogs may need less of a walk, but will still need a walk.")
                        }//end dog4 true

                        else (dog4 == "F"){
                            println("Thank you some common sense. though you may not to take smaller dogs out for as long, it varies to breed and personality.")

                            var dog5 = readLine()
                            println(" owning a dog is cheap. True or false? T/F")

                            if (dog5 == "T"){
                                println("Haha, You're funny. No it's not cheap. If it was cheap you probably have a stuffed dog.")
                            }//end dog 5 true

                            else (dog5 == "F") {
                                println("Yes! Cost may varies by dog, also health of the dog, so expect to lose a lot of money for your precious pups")
                            }//dog5 False

                        }//end dog4 false

                    }//end dog 3 false


                }//end dog2 False

            }//end True dog1

            else (dog1 == "F"){
                println("That's the wrong answer. even a small dog needs to be walked, just not as long.")
            }//end False dog1

        }//end of dog

        else pet = "cat"{

            var cat1 = readLine()
            println("True or False: Cats are soulless creatures")
            if (cat1 == "T") {
                println("I mean.. the rare occational cat may seem soulless, but if you really think this is for all cats, maybe being a cat owner isn't for you")
            }//cat1 true
            else (cat1 == "F"){
                println("Correct! While there are some devious cats out there, there are many just as soulful")

                var cat2 = readLine()
                println("T or F: cat's don't need a litter")

                if (cat2 == "T"){
                    println("If you really beleive this then I don't know what to tell you. Unless you're someone who wants their cat to use the toilet I guess.")
                }//cat2 true
                else (cat2 == "F"){
                   println("congradulations, you're a decent person")

                   var cat3 = readLine()
                   println("True or false: You don't need to play with a cat")

                   if (cat3 == "T"){
                        println("while its true there are toys that allow cats to play by themeslves, it does not mean they don't need to play with you to bond.")
                   }//cat3 True
                   else (cat3 == "F"){
                         println("Yay! You got this tricky question right.")

                         var cat4 = readLine()
                         println("You can use your cat in a witches ritual or sacrafice, true or false?")

                        if (cat4 == "T"){
                            println("If this was a sincere answer, never own a cat.")
                            //return done
                        }//cat 4 true
                        else (cat4 =="F"){
                             println("oh thank goodness I thought you were gonna be inhummane for a second.")

                             var cat5 = readLine()
                             println("T or F? You do not need to get your cat a scratch tree.")

                             if (cat5 == "T"){
                                println("Eh, technically I guess you're right? But your cat will be much happier even with a small scratch tree. And your furniture will thank you.")
                             }//cat5 true
                             else (cat5 == "F")
                                 println("Congradulations! You've made it to the end of the quiz! You've passed!")
                             }//cat5 false
                        }//cat4 false
                   }//cat3 false
                }//cat2 false
            } //cat1 False

        }//end of cat

        else (pet = "fish"){
            var fish1 = readLine()
            println("You don't need to worry about bacteria in the water bowl, your fish will just eat it?")

            if (fish1 == "T") {
                println("The first question and you already failed.")
            } //fish1 true
            else (fish1 == "F"){
                println("Yup! That's why you have to have chemicals that you put in your fish tank. The type of chemical and the amount may vary per fish")

                var fish2 = readLine()
                println("The type of fish you get dosen't matter, they all need the same things anyways.")

                if (fish2 == "T") {
                    println("I literally just gave you the answer last question. If you are not observant enough for that, then you are not observant enough for a fish.")
                }//fish2 true
                else (fish2 == "F"){
                    println("Correct! While care may be similar for many fish species, many different thing varies and its up to you to do research for that")

                    var fish3 = readLine()
                    println("You don't need to worry about fish bowl size for a small fish. the pet stores are perfect!")

                    if (fish3 == "T"){
                        println("No")
                    }//end fish3 True
                    else (fish3 == "F") {
                        println("I like you, have a cupcake.")

                        var fish4 = readLine()
                        println("you can train a fish True or False? ")
                        if (fish4 == "F") {
                            println("Actually this is true! Try again buddy")
                        }//fish4 false
                        else (fish4 == "T"){
                            println("It is! It takes different methods, but it is entirely possible to train fish. It's really up to you if that's worthwhile or not though.")

                            var fish5 = readLine()
                            println("true or False: You can't overfeed a fish?")

                            if (fish5 == "T") {
                                println("(Insert WRONG ANSWER button noise.) You can kill a fish by overfeeding it. It may be trainable, but it will eat past the point of fullness.")
                            }//fish5 true
                            else (fish5 == "F"){
                                println("Yes you can! you are correct.")
//                              return function name of the image of fish?
                            }//fish5 true
                        }//fish4 true
                    }//fish3 false
                }//fish2 false

            }//fish1 False

        }//end of fish

        println("Goodbye!")
    }// while not D
