//This is here for saving purposes to update, also becuaseI'm not familiar with intellij and want to ensure I don't lose progress.

fun Main(args: Array<String>) {
    println("Hello There!")

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Welcome to the Quiz!")
    println("This quiz gives you three pet options, a fish, dog or cats.");
    println("once you choose which pet you want you will be asked five True or False questions.")
    println("These are asked to determine if you are worthy of being it's pet owner")
    println("Type 'T' or 'F' in capitals to answer the question")
    //THE STREACH IS THE PET IMAGE. FINISH BASIC AND THEN TRY FOR IMAGE
    //println("If you are you'll meet your new pet. If you fail you may start the quiz again.")
    println("If you get a question wrong, you will have to retake all the questions that were asked. ")

    val done = println("When you are done with the quiz type 'd'  ")


    //while the user hasn't typed "done" do the quiz
    //this while done is showing as red becuase comp thinks you are reassinging the value. You need to set it as user input
    while (done != "d"){

        val pet = println("What pet do you want to get? dog/cat/fish ")

        //it has red underlines becuase you forgot to set the questions as user input
        if (pet = "dog"){
            val dog1=println("True or False: You do not need to walk your dog. T/F")

            if (dog1 = "T"){
                val dog2 =println("Your dog needs more than three meals a day? T/F")

                if (dog2 = "T"){
                    println("No it does not. Unless directed by a veternarian, it should only eat twice a day. Preferbly morning and night.")
                }//dog2 True
                else (dog2 ="F"){
                    println("Correct! ")

                    var dog3 = println("True or False: All a dog needs is cuddles? t/f ")
                    if (dog3 = "T") {

                        println("While cuddles are important for some dogs, that is not all a dog needs. I have hopes for you though, take the quiz again!")
                    }//end dog3 true

                    else (dog3 = "F"){
                        println(" Correct! Though, cuddles can be great both you and your dog will need space eventually.")
                        var dog4 = println("You don't need to take the dog out for a walk even if he is small")

                        if (dog4 = "T"){
                            println("That was just a sad answer. Of course you need to take your dog out! Smaller dogs may need less of a walk, but will still need a walk.")
                        }//end dog4 true

                        else (dog4 ="F"){
                            println("Thank you some common sense. though you may not to take smaller dogs out for as long, it varies to breed and personality.")

                            var dog5 = println(" owning a dog is cheap. True or false? T/F")

                            if (dog5 = "T"){
                                println("Haha, You're funny. No it's not cheap. If it was cheap you probably have a stuffed dog.")
                            }//end dog 5 true

                            else dog5 = "F"{
                                println("Again, varies by dog, and also health of the dog, so expect to lose a lot of money for your precious pups")
                            }//dog5 False

                        }//end dog4 false

                    }//end dog 3 false


                }//end dog2 False

            }//end True dog1

            else (dog1 = "F"){
                println("That's the wrong answer. even a small dog needs to be walked, just not as long.")
            }//end False dog1

            //ask user
            //1) is it true or false: You do not need to walk your dog ever : y/n
            //2)Your dog needs more than three meals a day? T/F
            //3)all a dog needs is cuddles? t/f if false then type "while important for some dogs, that's not all a dog needs"
            //4) you don't need to take the dog out even if he is small? T/F
            //5) owning a dog is cheap. True or false? T/F
            //6) a leash is optional True or False? T/F

        }//end of dog

        else pet = "cat"{
            //ask user
            //1)true or false: Cats are souless creatures? T/F
            //2)cats don't need a litter? T/F
            //3)you dont need to play with a cat? T/F (answer: even though there are quality toys that allow cats to play alone,
            //you still need to spend some quality time with a cat.
            //4)You can use your cat in a withces ritual true or false? T/F Answer: if you answer true "You will never be worthy of a cat"
            //5) cat tree's are optional, True or false? Ansewr: technically yes, but your cat will be much happier even with a small scratcher.
            //unless you want your couch to be the cat's scratcher



        }//end of cat

        else pet = "fish"{

            //Questions:
            //1) You don't need to worry about bactaeria in the water bowl? True or False? (answer False)
            //2) The type of fish you get dosen't matter, they all need the same things/ True or False (answer: false.)
            //3)You don't have to worry about fish bowl size for a small fish. The pet store ones are perfect:  True or False (answer: false, please don't buy a small fish bowl. Check fish manual to know what size would be best, don't listen to pet store people. Do your research
            //4) you can train a fish True or False? (Answer: actually you can! it works different;y and may vary by fish personality, but it is possible.
            //5) you can't overfeed a fish/ True or false: Yes you can overfeed. You shouldn't ned to feed it more than maybe 3 pebbles a day depending on the fish type.
        }//end of fish

        println("Goodbye!")
    }// while not D


}//end of fun Quiz