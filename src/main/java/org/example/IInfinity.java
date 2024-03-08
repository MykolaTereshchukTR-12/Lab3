package org.example;

public interface IInfinity {

    //Outputting the phrase 50 times using a for() loop.
    //The phrase is set by the user from the console.
    void PhraseFor(String buffer);

    //Outputting the phrase 50 times using a while() loop.
    //The phrase is set by the user from the console.
    void PhraseWhile(String buffer);

    //Imitation of a clock that runs for 3 minutes. A for() loop is used.
    void TwoMinutesFor();

    //Imitation of a clock that runs for 3 minutes. A while() loop is used.
    void TwoMinutesWhile();

    //Imitation of a clock that works for 3 hours. A while() loop is used.
    void TwoHoursFor();

    //Calculation of the function given by the task of laboratory work.
    //Function limits are set by the user in the console. A for() loop is used.
    void FunctionFor(double min, double max);

    //Calculation of the function given by the task of laboratory work.
    //Function limits are set by the user in the console. A while() loop is used.
    void FunctionWhile(double min, double max);

}