 
listView('MailAfter123 Jobs') {
    description('MailAfter123 Jobs')
    jobs {
        regex('MailAfter123_.+')
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
