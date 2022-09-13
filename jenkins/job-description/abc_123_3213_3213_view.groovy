 
listView('abc_123_3213_3213 Jobs') {
    description('abc_123_3213_3213 Jobs')
    jobs {
        regex('abc_123_3213_3213_.+')
    }
    columns {
        status()
        weather()
        name()
        lastSuccess()
        lastFailure()
        lastDuration()
        buildButton()
    }
}
