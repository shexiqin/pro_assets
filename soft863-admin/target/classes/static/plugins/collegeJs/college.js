function getMajorData(data){
    return axios({
        url:"/dia/college/getEmpRate",
        method:'GET',
        data
    })
}

function getMajorAscData(data){
    return axios({
        url:"/dia/college/getEmpRateAsc",
        method:'GET',
        data
    })
}

function getInfoData(data){
    return axios({
        url:"/dia/college/getCollegeInfo",
        method:'GET',
        data
    })
}