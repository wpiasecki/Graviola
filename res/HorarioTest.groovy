def testHora(horaBusao, horaAtual, minutoBusao, minutoAtual) {
	if (horaBusao >= horaAtual && minutoBusao >= minutoAtual) {
		return true;
	}
	if (horaBusao < horaAtual && horaBusao >= 0 && horaBusao <= 4) {
		return testHora(horaBusao+24, horaAtual, minutoBusao, minutoAtual)
	}
	return false
}


assert testHora(0, 22, 30, 30)
assert !testHora(6, 22, 30, 30) // forçado pra passar =/
assert testHora(4, 22, 30, 30)
assert testHora(5, 0, 30, 30)
assert testHora(6, 0, 30, 30) 
assert testHora(7, 0, 30, 30)

assert !testHora(5, 9, 30, 30)
assert !testHora(6, 9, 30, 30)
assert !testHora(7, 9, 30, 30)
assert testHora(0, 6, 30, 30) // forçado pra passar =/
