
def curr = { System.currentTimeMillis() }

def t0 = curr()
100000.times {
Calendar cal = Calendar.getInstance(TimeZone.getDefault());
}
println curr() - t0
