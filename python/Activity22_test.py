import pytest

def test_sum():
    num1 = 10
    num2=30
    sum=num1+num2
    assert sum==40

def test_diff():
    num1=50
    num2=30
    diff=num1-num2
    assert diff==20

@pytest.mark.activity
def test_prod():
    num1=10
    num2=30
    prod=num1*num2
    assert prod==300
    
@pytest.mark.activity
def test_quo():
    num1=100
    num2=5
    quo=num1/num2
    assert quo==20