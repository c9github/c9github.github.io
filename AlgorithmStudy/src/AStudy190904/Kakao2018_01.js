function solution(record) {
    var nick = {}
    var a = record.map(v => v.split(' '))
        a.slice().reverse().forEach(v=> {
            if(v[2] && !nick[v[1]]){
                nick[v[1]] = v[2]
            }
        })
    return a.filter(v => { return v[0] !== 'Change' }).map(v => { return v[0] === 'Enter' ? nick[v[1]] + '님이 들어왔습니다.' : nick[v[1]] + '님이 나갔습니다.' })
 }
 let record = [
    "Enter uid1234 Muzi",
    "Enter uid4567 Prodo",
    "Leave uid1234",
    "Enter uid1234 Prodo",
    "Change uid4567 Ryan"
 ]
 console.log(solution(record));