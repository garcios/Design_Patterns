package tut18.pattern.proxy;

import tut17.pattern.state.ATMState;

//This interface will contain just those methods
//that you want the proxy to provide access to

public interface GetATMData
{
public ATMState getATMState();
public int getCashInMachine();
}
