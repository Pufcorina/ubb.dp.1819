package ro.ubb.dp1819.lab3.behavioral.state.sourcemaking_02.after;


class StateOff implements State {
    public void pull(CeilingFan wrapper) {
        wrapper.setState(new StateLow());
        System.out.println("low speed");
    }
}
